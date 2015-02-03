////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Sophie Davis
//CSE2 - Spring 2015
//Prof. Brian Chen
//02-03-2015
//hw02 - Arithmetic Java program
    //this program computes the total cost of items bought on a trip to WalMart, including 6% PA sales tax
    //the input is the prices and quantities of the items purchased and the % sales tax
    //program should print out the following:
        //total cost of each item and sales tax for that total
        //total cost before tax
        //total cost including tax
public class Arithmetic {
    //start main method
    public static void main (String [ ] args) {
        int nSocks=3; //number of pairs of socks
        double sockCost$=2.58; //cost per pair of socks; '$' is included in variable name
        int nGlasses=6; //number of drinking glasses
        double glassCost$=2.29; //cost per glass; '$' included in variable name
        int nEnvelopes=1; //number of boxes of envelopes
        double envelopeCost$=3.25; //cost per box of envelopes 
        double taxPercent=0.06; //PA sales tax
            
            double totalSockCost$=(nSocks*sockCost$); //total cost of socks before tax
            double salesTaxOnSocks$=(totalSockCost$*taxPercent)*100; //sales tax on total cost of socks * 100 to prepare for int conversion
                int salesTaxOnSocksTemp$=(int)salesTaxOnSocks$; //sales tax on total cost of socks * 100 as int
                double salesTaxOnSocksFinal$=((double)salesTaxOnSocksTemp$)/100.0; //sales tax on total cost of socks rounded to hundredths place
            
            double totalGlassCost$=(nGlasses*glassCost$); //total cost of drinking glasses before tax
            double salesTaxOnGlasses$=(totalGlassCost$*taxPercent)*100; //sales tax on total cost of drinking glasses * 100 to prepare for int conversion
                int salesTaxOnGlassesTemp$=(int)salesTaxOnGlasses$; //sales tax on total cost of glasses * 100 as int
                double salesTaxOnGlassesFinal$=((double)salesTaxOnGlassesTemp$)/100.0; //sales tax on total cost of glasses rounded to hundredths place
            
            double totalEnvelopeCost$=(nEnvelopes*envelopeCost$); //total cost of envelopes before sales tax
            double salesTaxOnEnvelopes$=(totalEnvelopeCost$*taxPercent)*100; //sales tax on total cost of envelopes * 100 to prepare for int conversion
                int salesTaxOnEnvelopesTemp$=(int)salesTaxOnEnvelopes$; //sales tax on total cost of envelopes * 100 as int
                double salesTaxOnEnvelopesFinal$=((double)salesTaxOnEnvelopesTemp$)/100.0; //sales tax on total cost of envelopes rounded to hundredths place
            
            double subtotal$=(totalSockCost$+totalGlassCost$+totalEnvelopeCost$); //subtotal of all items before tax
            double totalSalesTax$=(salesTaxOnSocks$+salesTaxOnGlasses$+salesTaxOnEnvelopes$); //sales tax on entire purchase
                double totalSalesTaxFinal$=(salesTaxOnSocksFinal$+salesTaxOnGlassesFinal$+salesTaxOnEnvelopesFinal$); //sales tax on entire purchase rounded to hundredths
            double totalCost$=(subtotal$+totalSalesTax$); //total paid for transaction including sales tax
                double totalCostFinal$=(subtotal$+totalSalesTaxFinal$); //total paid for transaction rounded to hundredths
            
            //All answers are rounded to two decimal places by:
                //Multiplying the double by 100
                //Converting it to an integer, then
                //Converting back to a double and dividing by 100
            //This is imperfect because it only rounds down, not up, because converting the double to an 
            //integer eliminates all numbers after the decimal point without considering their value.
            
        
        System.out.println("Socks");
        System.out.println("Quantity: "+nSocks);
        System.out.println("Cost Per Item: $"+sockCost$);
        System.out.println("Total Cost for Socks: $"+totalSockCost$);
        System.out.println("Sales Tax on Socks: $"+salesTaxOnSocksFinal$);
       
        System.out.println(" ");
        
        System.out.println("Drinking Glasses");
        System.out.println("Quantity: "+nGlasses);
        System.out.println("Cost Per Item: $"+glassCost$);
        System.out.println("Total Cost for Glasses: $"+totalGlassCost$);
        System.out.println("Sales Tax on Glasses: $"+salesTaxOnGlassesFinal$);
        
        System.out.println(" ");
        
        System.out.println("Envelopes");
        System.out.println("Quantity: "+nEnvelopes);
        System.out.println("Cost Per Item: $"+envelopeCost$);
        System.out.println("Total Cost for Envelopes: $"+totalEnvelopeCost$);
        System.out.println("Sales Tax on Envelopes: $"+salesTaxOnEnvelopesFinal$);
        
        System.out.println("-----");
        
        System.out.println("SUBTOTAL: $"+(subtotal$));
        System.out.println("SALES TAX: $"+(totalSalesTaxFinal$));
        System.out.println("TOTAL COST: $"+(totalCostFinal$)+"0");
            
    }
}