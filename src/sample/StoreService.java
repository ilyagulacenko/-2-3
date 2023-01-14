package sample;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(serviceName = "DisplayAssortment", portName = "DisplayAssortmentPort", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class StoreService {
    // store Supermarket assortment
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

    @WebMethod(operationName = "GetStoreAssortment")
    public StoreAssortment getStoreAssortment() {
        return storeAssortment;
    }

}