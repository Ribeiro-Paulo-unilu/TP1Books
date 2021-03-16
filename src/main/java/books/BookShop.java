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
    	 double cost=0;
    	 int counter=0;
    	 int totalbooks=0;
    	 
    	for(int i =0;i <5;i++) {
    		if(books[i]>0) {
    			counter++;
    			totalbooks+=books[i];
    		} 
    		
    	}
    	cost=(totalbooks-counter)*8;
    	
    	if(counter==1) {
    		cost+= counter*8;
    	}
    	if (counter==2){
    		
    	cost+= counter*8*(93/100.0) ;
    	}
    	
    	if (counter==3) {
    		cost+= counter*8*(86/100.0);
    	}
    	if (counter==4) {
    		cost+= counter*8*(72/100.0);
    	}
    	if(counter==5) {
    		cost+= counter*8*(65/100.0);
    	}
    	
        return cost;
    }
}
