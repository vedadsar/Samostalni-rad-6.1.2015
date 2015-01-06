
public class StringDynamicArrays {

	private String [] array;
	private int counter;
	private final static int INITIAL_SIZE = 2;
	
	
	public StringDynamicArrays(){
		this(INITIAL_SIZE);
	}
	
	public StringDynamicArrays (int size){
		
		this.array = new String[size];
		this.counter=0;
	}
	
	
	/**
	 * Add method which adds new element in our array. 
	 * First it'll check if array has no free slots. In that case we call 'resize' method.
	 * @param string
	 */
	public void add(String value){
		
		if(this.array.length == counter)  // Checking if array is full.
			resize();					  // Calling resize method which will resize our array ( to double size )	
		
		this.array[counter] = value; 	 // Adding a value sent as argument to our array.
		counter++;						// Increasing counter
		
		
	}

	/**
	 * Private resize method that we use to resize our array. 
	 */
	private void resize() {
		
		String [] temp = this.array;					//Saving our array to temp array
		this.array = new String[temp.length*2];			// Increasing length of our array
		
		for(int i=0; i<counter; i++)					// For loop where we moving our array elements to new array which has been resized.	
			this.array[i] = temp[i];
		
	}

	/**
	 * Method for removing and element from our array. We are doing this by moving all elements 1 step to left from the index of element we wanna remove.
	 * @param offset is index of element we want to remove.
	 */
	public void remove (int offset){
		
		if(offset < 0 || offset > counter)														// Checking if sent offset parameter is regular
			throw new  ArrayIndexOutOfBoundsException("Greska u remove metodi");
		
		for(int i=offset; i<counter-1;i++){														//for loop where we're moving our array elements 1 step to left
			array[i] = array[i+1];
		}
		counter--;																				// Reducing counter since we removed element.
						
	}
	
	/**
	 * Method for setting value of an element. 
	 * @param offset	index of element we want to set
	 * @param value		new value of our element
	 */
	public void setValue(int offset, String value){
		
		if(offset <0 || offset > counter)
			throw new ArrayIndexOutOfBoundsException("Greska u setValue");
		
		this.array[offset] = value;
		
	}
	
	/**
	 * Method which returns value of element we want. We send this method a offset parameter which is index of element we want to get.
	 * @param offset	index of element we want to get
	 * @return	String, value of element at index we send.		
	 */
	public String getAt (int offset){
		if(offset <0 || offset > counter)
			throw new ArrayIndexOutOfBoundsException("Greska u setValue");
		
		return this.array[offset];
	}
	
	/**
	 * Method which returns an array of strings. We will create new array to avoid sending blank elements. Array we send will have 'counter' elements.
	 * @return array of strings.
	 */
	public String [] toArray(){
		
		String[] toArray = new String [counter];			//Array we are going to return
		
		for(int i=0; i<counter;i++)							//In this loop we'll copy elements from our array to toArray array.
			toArray[i] = this.array[i];
		
		return toArray;
		
	}
	
	
	
}
