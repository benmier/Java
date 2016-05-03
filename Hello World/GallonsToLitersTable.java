class GallonsToLitersTable {
    public static void main(String args[]) {
    	for(int gallons=1; gallons<=100; gallons++){
    		System.out.println(gallons+" gallons is "+gallons*3.78541+" liters");
    		if(gallons%10==0)
    			System.out.println();
    	}
    }
}