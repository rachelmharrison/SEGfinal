public class Schedule{

	String[] schedule= new String[14];
  /*
  String monIn;
  String monOut;
  String tuesIn;
  String tuesOut;
  String wedIn;
  String wedOut;
  String thrusIn;
  String thrusOut;
  String friIn;
  String friOut;
*/

  public Schedule(String si, String so,String mi,String mo, String ti, String to, String wi, String wo, String thi, String tho, String fi, String fo, String sti, String sto){
		schedule[0]=si;
    schedule[1]=so;
    schedule[2]=mi;
    schedule[3]=mo;
    schedule[4]=ti;
    schedule[5]=to;
    schedule[6]=wi;
    schedule[7]=wo;
    schedule[8]=thi;
    schedule[9]=tho;
    schedule[10]=fi;
    schedule[11]=fo;
    schedule[12]=sti;
    schedule[13]=sto;
	}
  
  public String[] getSchedule(){
    return schedule;
  }
  
}
