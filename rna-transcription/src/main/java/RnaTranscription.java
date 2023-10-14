class RnaTranscription {

    String transcribe(String dnaStrand) {
        if(dnaStrand.isEmpty())
            return "";
        StringBuilder s = new StringBuilder();
        for(int i=0;i<dnaStrand.length();i++)
        {
            if(dnaStrand.charAt(i) == 'A')
                s.append("U");
            else if(dnaStrand.charAt(i) == 'T')
                s.append("A");
            else if (dnaStrand.charAt(i) == 'G')
                s.append("C");
            else
                s.append("G");
        }
        return s.toString();
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
