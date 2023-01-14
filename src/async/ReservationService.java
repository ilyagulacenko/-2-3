package async;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.Endpoint;

@WebService(serviceName = "Reservation", portName = "ReservationPort", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class ReservationService {

	// store Supermarket assortment
	//TODO поменять
	private static Supermarket[] supermarketData = {
			new Supermarket("0001", "Bakery products", "White bread", "Bread straight from the factory!",50),
			new Supermarket("0002","Chemistry products", "Cleaning agent", "Remove any dirt",450),
			new Supermarket("0003", "Technics", "A vacuum cleaner", "Make your house clean",8000),
			new Supermarket("0004", "Water products", "Coca-Cola", "Refreshing drink",100),
			new Supermarket("0005", "Bakery products", "Long loaf", "Bread straight from the factory!",60)
	};
	// the number of products in the store
	private static int[] quantityData = {75, 24, 13, 52, 61};
	private static StoreAssortment storeAssortment = new StoreAssortment(supermarketData, quantityData);
	private UserReserve goReserveSupermarket(String type, int quantity) {
		int size = storeAssortment.getSupermarkets().length;
		for (int i = 0; i < size; i++) {
			Supermarket currentSupermarket = storeAssortment.getSupermarkets()[i];
			int currentQuantity = storeAssortment.getQuantity()[i];
			if (type.equals(currentSupermarket.getType()) && quantity <= currentQuantity) {
				storeAssortment.setQuantityFromIndex(i, currentQuantity - quantity);
				return new UserReserve(currentSupermarket, quantity);
			}
		}
		return null;
	}

	@WebMethod(operationName = "ReserveSupermarket")
	public UserReserve reserveSupermarket(String type, int quantity) {
		try {
			Thread.sleep(1000*10); // Sleep for 10 seconds
			return goReserveSupermarket(type, quantity);
		} catch(InterruptedException e) {
			e.printStackTrace();
			return null;
		}
	}

	 public static void main(String args[]) {
	        Endpoint.publish("http://localhost:8082/Reservation", new ReservationService());
	  }
}
