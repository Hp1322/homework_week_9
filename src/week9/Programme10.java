package week9;

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        String[] stationName = new String[] {"Aldgate", "Liverpool Street", "Moorgate", "Barbican", "Borough"
                + "London Bridge", "Old Street", "Baker Street"+
                "Regent's Park", "Picaadilly Circus", "Bank", "Holborn"
                +"St Paul's", "Bond Street", "Edgware Road", "Farringdon"+
                "Edgware Road", "Paddington", "Bayswater", "Aldgate East" +
                "Moorgate","Westminster", "Waterloo", "Green Park," +
                "Leicester Square", "Covent Garden", "Euston"
                +"Warren Street", "Oxford Circus", "Green Park"};

        //System.out.println(stationName.length);
        int len = stationName.length;

        String[][] tubeLines = new String[12][len];

        tubeLines[0][0] = "Metropolitan";
        tubeLines[0][1] = "Aldgate";
        tubeLines[0][2] = "Liverpool Street";
        tubeLines[0][3] = "Moorgate";
        tubeLines[0][4] = "Barbican";

        tubeLines[1][0] = "Northern";
        tubeLines[1][1] = "Borough";
        tubeLines[1][2] = "London Bridge";
        tubeLines[1][3] = "Moorgate";
        tubeLines[1][4] = "Old Street";

        tubeLines[2][0] = "Waterloo & City";
        tubeLines[2][1] = "Bank";
        tubeLines[2][2] = "Waterloo";

        tubeLines[3][0] = "Bakerloo";
        tubeLines[3][1] = "Baker Street";
        tubeLines[3][2] = "Regent's Park";
        tubeLines[3][3] = "Oxford Circus";
        tubeLines[3][4] = "Picaadilly Circus";

        tubeLines[4][0] = "Central";
        tubeLines[4][1] = "Bank";
        tubeLines[4][2] = "Holborn";
        tubeLines[4][3] = "St Paul's";
        tubeLines[4][4] = "Bond Street";

        tubeLines[5][0] = "Circle";
        tubeLines[5][1] = "Edgware Road";
        tubeLines[5][2] = "Baker Street";
        tubeLines[5][3] = "Farringdon";
        tubeLines[5][4] = "Barbican";

        tubeLines[6][0] = "DLR";
        tubeLines[6][1] = "Bank";

        tubeLines[7][0] = "District";
        tubeLines[7][1] = "Edgware Road";
        tubeLines[7][2] = "Paddington";
        tubeLines[7][3] = "Bayswater";

        tubeLines[8][0] = "Hammersmith & City";
        tubeLines[8][1] = "Aldgate East";
        tubeLines[8][2] = "Liverpool Street";
        tubeLines[8][3] = "Moorgate";
        tubeLines[8][4] = "Barbican";

        tubeLines[9][0] = "Jubilee";
        tubeLines[9][1] = "Baker Street";
        tubeLines[9][2] = "Bond Street";
        tubeLines[9][3] = "Westminster";
        tubeLines[9][4] = "Waterloo";

        tubeLines[10][0] = "Piccadilly";
        tubeLines[10][1] = "Green Park";
        tubeLines[10][2] = "Picaadilly Circus";
        tubeLines[10][3] = "Leicester Square";
        tubeLines[10][4] = "Covent Garden";

        tubeLines[11][0] = "Victoria";
        tubeLines[11][1] = "Euston";
        tubeLines[11][2] = "Warren Street";
        tubeLines[11][3] = "Oxford Circus";
        tubeLines[11][4] = "Green Park";

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter tube station name of zone 1");
        String userTubeLine = scan.nextLine();
        String catchStationName = "";


        for(int i = 0; i < stationName.length; i++){
            if(userTubeLine.equalsIgnoreCase(stationName[i])){
                catchStationName = stationName[i];
            }
        }
        if(userTubeLine.equalsIgnoreCase(catchStationName)){
            System.out.println(userTubeLine + "Station is in the zone 1");
            System.out.println("_______________________________________");
            System.out.println("Following line passsing through the given Tube Station : " +userTubeLine);
            System.out.println("_________________________________________");

            for(int x = 0; x < tubeLines.length; x++){
                for (int y = 1; y < tubeLines.length; y++){
                    String match = tubeLines[x][y];

                    if(userTubeLine.equalsIgnoreCase(match)){
                        System.out.println(tubeLines[x][0]);
                    }
                }
            }
        }else {
            System.out.println("Given station is not in zone 1");
        }
    }
}
