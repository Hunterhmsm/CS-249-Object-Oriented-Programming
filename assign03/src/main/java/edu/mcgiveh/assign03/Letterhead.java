package edu.mcgiveh.assign03;


public class Letterhead {

    private String businessName;
    private String [] slogans;
    private char boundary;
    public Letterhead(String name, String[] sloganLines, char boundaryChar) {
        setName(name);
        setBoundaryChar(boundaryChar);
        setSlogan(sloganLines);
    }

    public String getName(){return businessName;}

    public char getBoundaryChar(){return boundary;}

    public String getSlogan() {
        StringBuilder sloganBuilder = new StringBuilder();
            for (int i = 0; i < slogans.length; i++) {
                sloganBuilder.append(slogans[i] + "\n");
            }
        return sloganBuilder.toString();
    }


    public void setName(String name){
        businessName = name;
    }

    public void setBoundaryChar(char boundaryCharacter){
        boundary = boundaryCharacter;
    }

    public void setSlogan(String [] sloganLines){
        slogans = new String[sloganLines.length];
        for(int i = 0; i < sloganLines.length; i++){
            slogans[i] = sloganLines[i];
        }
    }

    public String toString(){
        StringBuilder letterHeadBuilder = new StringBuilder();
        int linesLeft = 4;

        // FIRST LINE OF THE LETTERHEAD
        for(int i = 0; i < 40; i++){
            letterHeadBuilder.append(boundary);
        }
        letterHeadBuilder.append("\n");

        //SECOND LINE OF THE LETTERHEAD
        letterHeadBuilder.append(formater(businessName, boundary));

        //THIRD LINE OF THE LETTERHEAD
        letterHeadBuilder.append(formater("", boundary));

        //SLOGAN AND EMPTY SPACE PART
        for(int i = 0; i < slogans.length; i++){
            letterHeadBuilder.append(formater(slogans[i], boundary));
            linesLeft = linesLeft - 1;
        }
        for(int i = 0; linesLeft > 0; linesLeft--){
            letterHeadBuilder.append(formater("", boundary));
        }

        //LAST LINE
        for(int i = 0; i < 40; i++){
            letterHeadBuilder.append(boundary);
        }
        letterHeadBuilder.append("\n");

        return letterHeadBuilder.toString();
    }

    private String formater(String toFormat, char boundaryChar){
        StringBuilder formatting = new StringBuilder();
        int spaces = (40 - 3 - toFormat.length());

        formatting.append(boundaryChar + " " + toFormat);
        for(int i = 0; i < spaces; i++){
            formatting.append(" ");
        }
        formatting.append(boundaryChar + "\n");
        return formatting.toString();
    }
}

