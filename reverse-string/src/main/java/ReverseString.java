class ReverseString {

    String reverse(String inputString) {
        if(inputString.isEmpty())
            return inputString;
        StringBuilder str = new StringBuilder();
        str.append(inputString);
        str.reverse();
        return String.valueOf(str);
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
  
}
