package books;



public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
        
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        //books = [2,1,3,4,1]
    	 float cost=0;
    	 int counter=0;
    	 
    	for(int i =0;i <5;i++) {
    		if(books[i]>0) {
    			counter++;
    		} 
    		cost+=8*books[i];
    	}
    	if (counter==2){
    		cost-= 16*(7/100);
    	}
    	if (counter==3) {
    		cost-= 24*(14/100);
    	}
    	if (counter==4) {
    		cost-= 32*(28/100);
    	}
    	if(counter==5) {
    		cost-= 40*(35/100);
    	}
    	
        return cost;
    }
}
