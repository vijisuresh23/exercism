class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<dnaStrand.length();i++){
             if(dnaStrand.charAt(i)=='G')
                str.append("C");
             else if(dnaStrand.charAt(i)=='C')
                str.append("G");
             else if(dnaStrand.charAt(i)=='T')
                str.append("A");
            else
                 str.append("U");
            }
        String output1=str.toString();
        return output1;
    }

}
