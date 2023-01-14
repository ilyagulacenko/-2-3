package async.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.xml.namespace.QName;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

public class ReservationClient {

    private final static QName RESERVATION_QNAME = new QName(
            "http://asu.dgtu.donetsk.ua/ex/students", "Reservation"
    );
    // User choice reserve
    private String Supermarket_TYPE = "Water products";
    private int QUANTITY_RESERVE = 2;
    class ReserveAsyncHandler implements AsyncHandler<ReserveSupermarketResponse> {
        private ReserveSupermarketResponse response;
        @Override
        public void handleResponse(Response<ReserveSupermarketResponse> res) {
            try {
                response = res.get(2000, TimeUnit.MILLISECONDS);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        public UserReserve getResponse() {
            return response.getReturn();
        }
    }

    private static URL getWSDLURL(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return url;
    }

    public UserReserve processCallback(URL url, String typeRes, int quantityRes) {
        Reservation svc = new Reservation(url, RESERVATION_QNAME);
        ReservationService port = svc.getReservationPort();
        ReserveAsyncHandler asyncHandler = new ReserveAsyncHandler();
        Future<?> futureResponse = port.reserveSupermarketAsync(typeRes, quantityRes, asyncHandler);

        while (!futureResponse.isDone()) {
            try {
                System.out.println("Please wait...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        UserReserve userSupermarketReserve = asyncHandler.getResponse();
        return userSupermarketReserve;
    }

    private static void printUserReserve(UserReserve reserve) {
        if (reserve != null) {
            System.out.println("\n*** Вы зарезервировали товар ***\n --------------------------------");
            Supermarket supermarket = reserve.getSupermarket();
            System.out.println(
                    supermarket.type + " | " +
                    supermarket.name + " | " +
                    supermarket.description + " | " +
                    supermarket.price + "P" +
                    " | Amount: " + reserve.quantity +
                    " | Sum: " + reserve.totalAmount);
        } else {
            System.out.println("\n*** Не удалось зарезервировать товар ***\n --------------------------------");
        }
    }

    public static void main(String[] args) {
        URL url = getWSDLURL("http://localhost:8082/Reservation?wsdl");
        ReservationClient client = new ReservationClient();
        UserReserve userSupermarketReserve = client.processCallback(url, client.Supermarket_TYPE, client.QUANTITY_RESERVE);
        printUserReserve(userSupermarketReserve);
    }


}
