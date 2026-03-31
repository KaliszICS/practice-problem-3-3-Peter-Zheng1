public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String evenOrOdd(int num) {

	if (num == 0){
		return "Zero";
	}
    else if (num % 2 == 0){
        return "Even";
        
    }
    else {
        return "Odd";
        
    }
    
}

public static String positiveOrNegative(int num){
    if (num > 0){
        return "Positive";
    }
    
    else if (num == 0){
        return "Zero";
    }
    
    else{
        return "Negative"; 
    }
}


public static String pluralize(String word){
    word = word.toLowerCase();

    if (word.endsWith("ey")){
           return "eys";
    }
    
	    else if (word.endsWith("y")){
		    return "ies";

	}
            else if (word.endsWith("ife")){
		        return "ives";
	}
		
	else{
		return "s";
	}

}

}
