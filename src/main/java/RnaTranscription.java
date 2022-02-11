class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        char[] rna =new char[dnaStrand.length()];
        int i;
        for(i=0;i<dnaStrand.length();i++)
        {
            if(dnaStrand.charAt(i)=='G')
                rna[i]='C';
            else if(dnaStrand.charAt(i)=='C')
                rna[i]='G';
            else if(dnaStrand.charAt(i)=='T')
                rna[i]='A';
            else if(dnaStrand.charAt(i)=='A')
                rna[i]='U';
                    
        }
        dnaStrand=String.valueOf(rna);
        return dnaStrand;
    }


}
