public class partTime{

public static void main(String[] args){

	int IS_PART_TIME=0;
	int HOURS=8;
	int RATE_PER_HOUR=20;
	int p=0;
	double empCheck=Math.floor(Math.random() * 10) %2;
	if(empCheck==IS_PART_TIME)
	System.out.println("employee is parttime");
	else
	System.out.println("no such employee");
	p=HOURS*RATE_PER_HOUR;
	System.out.println("parttime daily wage is;"+p);
}
}
