import java.util.*;
class BookingDetails
{
int flag=0,day,d1,month,year,to,from,cost1,cost2,age,physicallyChallenged,wheelChair,physicallyChallengedType,choice,e;
long adharNumber,contactNumber;
String name,email,customerType,gender,flightName,time;
Scanner sc=new Scanner(System.in);
void flightDetails()
{
System.out.println("--------------------Welcome to Voyage Airlines--------------------");
System.out.println("*****Discover your Passion and explore our Country*****");
System.out.println("Best deals at affordable cost and your convenience!!");
System.out.println("Travel Wanderlust, Summer vacay, To the wild, Adventure awaits, Nature beckons, Go solo!"+"\n");
do
{
System.out.println("Choose your destinations:\n1.Pune"+"\n"+"2.Chennai"+"\n"+"3.Delhi"+"\n"+"4.Kolkata");
System.out.print("From:");
from=sc.nextInt();
System.out.print("To:");
to=sc.nextInt();
flag=0;
if(((from==1)&&(to==1))||((from==2)&&(to==2))||((from==3)&&(to==3))||((from==4)&&(to==4))||to>4||from>4)
{
System.out.println("Destination can not be same as the source\nPlease enter again");
flag=1;
}
}while(flag==1);


do
{
System.out.println("Enter travel date");
day=sc.nextInt();
month=sc.nextInt();
year=sc.nextInt();
if(year>=2024&&year<2026)
{
	if(year==2024&&month<4)
	{
		System.out.println("Invalid date");
	    d1=0;
	}
	else if(year==2024&&month==4&&day<19)
	{
		System.out.println("Invalid date");
		d1=0;
		
	}
	else
	{
		d1=1;
	}
	
}
else
{
	System.out.println("Invalid date");
	d1=0;
}
}while(d1!=1);

if(year==2024&&month==4&&day>19&&(day-19)<=2)
{
	 choice=1;
}
else
{
	 choice=2;
	
}

System.out.println("Entered date of travel is:"+day+"/"+month+"/"+year);
switch(choice)
{
case 1:
{
if (((from==1)&&(to==3))||((from==3)&&(to==1)))
{
System.out.println("Available tickets are:");
System.out.println("Flight 1: 6E-6798"+"\n"+"Duration:08h 35m"+"\n"+"Departure9:20 am");
System.out.println("Economy: ₹5,200 + Instant booking surplus charges-₹490 only"+"\nNet charges:₹5690");
System.out.println("Business: ₹10400 + Instant booking surplus charges-₹980 only"+"\nNet charges:₹11800");
System.out.println("---------------------");
System.out.println("Flight 2: 6E-2432"+"\n"+"Duration:07h 15m"+"\n"+"Departure12:00 pm");
System.out.println("Economy: ₹6,210 + Instant booking surplus charges-₹490 only"+"\nNet charges:₹6700");
System.out.println("Business: ₹12420 + Instant booking surplus charges-₹980 only"+"\nNet charges:₹13400");
System.out.println("---------------------");
System.out.println("Flight 3: AI-1852"+"\n"+"Duration:7h 35m"+"\n"+"Departure3:56 am");
System.out.println("Economy: ₹5,850 + Instant booking surplus charges-₹490 only"+"\nNet charges:₹6340");
System.out.println("Business: ₹12920 + Instant booking surplus charges-₹980 only"+"\nNet charges:₹13900");
System.out.println("---------------------");
System.out.println("Flight 4: 6E-2279"+"\n"+"Duration:08h 05m"+"\n"+"Departure11:20 pm");
System.out.println("Economy: ₹4,670 + Instant booking surplus charges-₹490 only"+"\nNet charges:₹5160");
System.out.println("Business: ₹7,005 + Instant booking surplus charges-₹980 only"+"\nNet charges:₹7985");
System.out.println("---------------------");
System.out.println("Cheapest Option: 4");
System.out.println("Fastest Option: 2");
System.out.println("---------------------");
System.out.print("Enter your preference: ");
int choice1= sc.nextInt();
switch(choice1)
{
case 1:
{
System.out.println("You have chosen flight 6E-6798."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =5690;
cost2 =11800;
flightName="6E-6798";
time="Departure- 9:20 am, Duration- 08h 35m";
break;
}
case 2:
{
System.out.println("You have chosen flight 6E-2432."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =6700;
cost2 =13400;
flightName="6E-2432";
time="Departure- 12:00 pm, Duration- 07h 15m";
break;
}
case 3:
{
System.out.println("You have chosen flight AI-1852."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 = 6340;
cost2 =13900;
flightName="AI-1852";
time="Departure- 3:56 am, Duration- 07h 35m";
break;
}
case 4:
{
System.out.println("You have chosen flight 6E-2279."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =5160;
cost2 =7985;
flightName="6E-2279";
time="Departure- 11:20 pm, Duration- 08h 05m";
break;
}
}
}
if (((from==1)&&(to==2))||((from==2)&&(to==1))){
System.out.println("Available tickets are:");
System.out.println("Flight 1: 6E625"+"\n"+"Duration:01h 40m"+"\n"+"Departure- 5:30 am");
System.out.println("Economy: ₹4,578 + Instant booking surplus charges-₹490 only"+"\nNet charges:₹5068");
System.out.println("Business: ₹9156 + Instant booking surplus charges-₹980 only"+"\nNet charges:₹10136");
System.out.println("---------------------");
System.out.println("Flight 2:6E6745"+"\n"+"Duration:01h 45m"+"\n"+"Departure- 8:10 pm");
System.out.println("Economy: ₹4,767 + Instant booking surplus charges-₹490 only"+"\nNet charges:₹5257");
System.out.println("Business: ₹9534 + Instant booking surplus charges-₹980 only"+"\nNet charges:₹10514");
System.out.println("---------------------");
System.out.println("Flight 3:SG-611"+"\n"+"Duration:12h 25m"+"\n"+"Departure- 9:56 am");
System.out.println("Economy: ₹4,500 + Instant booking surplus charges-₹490 only"+"\nNet charges:₹4990");
System.out.println("Business: ₹9000 + Instant booking surplus charges-₹980 only"+"\nNet charges:₹9980");
System.out.println("---------------------");
System.out.println("Cheapest Option: 3");
System.out.println("Fastest Option: 1");
System.out.println("---------------------");
System.out.print("Enter your preference: ");
int choicen= sc.nextInt();
switch(choicen)
{
case 1:
{
System.out.println("You have chosen flight 6E625."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 = 5068;
cost2 = 10136;
flightName="6E625";
time="Departure- 5:30 am, Duration- 01h 40m";
break;
}
case 2:
{
System.out.println("You have chosen flight 6E6745."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =5257;
cost2 =10514;
flightName="6E6745";
time="Departure- 8:10 pm, Duration- 01h 45m";
break;
}
case 3:
{
System.out.println("You have chosen flight SG-611."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =4990;
cost2 =9980;
flightName="SG-611";
time="Departure- 9:56 am, Duration- 12h 25m";
break;
}
}
}
if (((from==1)&&(to==4))||((from==4)&&(to==1))){
System.out.println("Available tickets are:");
System.out.println("Flight 1: I5-975"+"\n"+"Duration:06h 05m"+"\n"+"Departure11:08 am");
System.out.println("Economy: ₹7,245 + Instant booking surplus charges-₹490 only"+"\nNet charges:₹7735");
System.out.println("Business: ₹18135 + Instant booking surplus charges-₹980 only"+"\nNet charges:₹19115");
System.out.println("---------------------");
System.out.println("Flight 2: I5-1533"+"\n"+"Duration:04h 35m"+"\n"+"Departure4:09 pm");
System.out.println("Economy: ₹8,411 + Instant booking surplus charges-₹490 only"+"\nNet charges:₹8901");
System.out.println("Business: ₹16822 + Instant booking surplus charges-₹980 only"+"\nNet charges:₹17820");
System.out.println("---------------------");
System.out.println("Flight 3: 6E-819"+"\n"+"Duration:02h 35m"+"\n"+"Departure10:40 pm");
System.out.println("Economy: ₹6,890 + Instant booking surplus charges-₹490 only"+"\nNet charges:₹7380");
System.out.println("Business: ₹13780 + Instant booking surplus charges-₹980 only"+"\nNet charges:₹14760");
System.out.println("---------------------");
System.out.println("Flight 4: 6E-671"+"\n"+"Duration:02h 05m"+"\n"+"Departure11:00 am");
System.out.println("Economy: ₹8,900 + Instant booking surplus charges-₹490 only"+"\nNet charges:₹9390");
System.out.println("Business: ₹17800 + Instant booking surplus charges-₹980 only"+"\nNet charges:₹18780");
System.out.println("---------------------");
System.out.println("Cheapest Option: 3");
System.out.println("Fastest Option: 4");
System.out.println("---------------------");
System.out.print("Enter your preference: ");
int choice2= sc.nextInt();
switch(choice2)
{
case 1:
{
System.out.println("You have chosen flight I5-975."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =7735;
cost2 =19115;
flightName="I5-975";
time="Departure- 11:08 am, Duration- 06h 05m";
break;
}
case 2:
{
System.out.println("You have chosen flight I5-1533."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =8901;
cost2 =17820;
flightName="I5-1533";
time="Departure- 4:09 pm, Duration- 04h 35m";
break;
}
case 3:
{
System.out.println("You have chosen flight 6E-819."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =7380;
cost2 =14760;
flightName="6E-819";
time="Departure- 10:40 pm, Duration- 02h 35m";
break;
}
case 4:
{
System.out.println("You have chosen flight 6E-671."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =9390;
cost2 =18780;
flightName="6E-671";
time="Departure- 11:00 am, Duration- 02h 05m";
break;
}
}
}
if (((from==2)&&(to==3))||((from==3)&&(to==2))){
System.out.println("Available tickets are:");
System.out.println("Flight 1: 6E-5045"+"\n"+"Duration:02h 50m"+"\n"+"Departure5:45 pm");
System.out.println("Economy: ₹5,939 + Instant booking surplus charges-₹490 only"+"\nNet charges:₹6429");
System.out.println("Business: ₹11878 + Instant booking surplus charges-₹980 only"+"\nNet charges:₹12858");
System.out.println("---------------------");
System.out.println("Flight 2: UK-832"+"\n"+"Duration:02h 35m"+"\n"+"Departure3:17 am");
System.out.println("Economy: ₹7,767 + Instant booking surplus charges-₹490 only"+"\nNet charges:₹8257");
System.out.println("Business: ₹15534 + Instant booking surplus charges-₹980 only"+"\nNet charges:₹16514");
System.out.println("---------------------");
System.out.println("Flight 3: SG-8947"+"\n"+"Duration:02h 05m"+"\n"+"Departure1:40 am");
System.out.println("Economy: ₹7,009 + Instant booking surplus charges-₹490 only"+"\nNet charges:₹7499");
System.out.println("Business: ₹14018 + Instant booking surplus charges-₹980 only"+"\nNet charges:₹14998");
System.out.println("---------------------");
System.out.println("Cheapest Option: 1");
System.out.println("Fastest Option: 3");
System.out.println("---------------------");
System.out.print("Enter your preference: ");
int choice3= sc.nextInt();
switch(choice3)
{
case 1:
{
System.out.println("You have chosen flight 6E-5045."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =7735;
cost2 =19115;
flightName="6E-5045";
time="Departure- 5:45 pm, Duration- 02h 50m";
break;
}
case 2:
{
System.out.println("You have chosen flight UK-832."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =8901;
cost2 =17820;
flightName="UK-832";
time="Departure- 3:17 am, Duration- 02h 35m";
break;
}
case 3:
{
System.out.println("You have chosen flight SG-8947."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =9390;
cost2 =18780;
flightName="SG-8947";
time="Departure- 1:40 am, Duration- 02h 05m";
break;
}
}
}
if (((from==2)&&(to==4))||((from==4)&&(to==2))){
System.out.println("Available tickets are:");
System.out.println("Flight 1: I5-611"+"\n"+"Duration:03h 40m"+"\n"+"Departure4:50 am");
System.out.println("Economy: ₹7,619 + Instant booking surplus charges-₹490 only"+"Net charges:₹8109");
System.out.println("Business: ₹15238 + Instant booking surplus charges-₹980 only"+"Net charges:₹16218");
System.out.println("---------------------");
System.out.println("Flight 2: AI-786"+"\n"+"Duration:01h 50m"+"\n"+"Departure8:15 pm");
System.out.println("Economy: ₹8,115 + Instant booking surplus charges-₹490 only"+"Net charges:₹8605");
System.out.println("Business: ₹16230 + Instant booking surplus charges-₹980 only"+"Net charges:₹17210");
System.out.println("---------------------");
System.out.println("Flight 3: IX-1645"+"\n"+"Duration:02h 00m"+"\n"+"Departure3:33 pm");
System.out.println("Economy: ₹8,000 + Instant booking surplus charges-₹490 only"+"Net charges:₹8490");
System.out.println("Business: ₹1600 + Instant booking surplus charges-₹980 only"+"Net charges:₹16980");
System.out.println("---------------------");
System.out.println("Cheapest Option: 1");
System.out.println("Fastest Option: 2");
System.out.println("---------------------");
System.out.print("Enter your preference: ");
int choice4= sc.nextInt();
switch(choice4)
{
case 1:
{
System.out.println("You have chosen flight I5-611."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =8109;
cost2 =16218;
flightName="I5-611";
time="Departure- 4:50 am, Duration- 03h 40m";
break;
}
case 2:
{
System.out.println("You have chosen flight AI-786."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =8605;
cost2 =17210;
flightName="AI-786";
time="Departure- 8:15 pm, Duration- 01h 50m";
break;
}
case 3:
{
System.out.println("You have chosen flight IX-1645."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =8490;
cost2 =16980;
flightName="IX-1645";
time="Departure- 3:33 pm, Duration- 02h 00m";
break;
}
}
}
if (((from==3)&&(to==4))||((from==4)&&(to==3))){
System.out.println("Available tickets are:");
System.out.println("Flight 1: 6E-353"+"\n"+"Duration:02h 10m"+"\n"+"Departure1:12 am");
System.out.println("Economy: ₹7,108 + Instant booking surplus charges-₹490 only"+"Net charges:₹7598");
System.out.println("Business: ₹14216 + Instant booking surplus charges-₹980 only"+"Net charges:₹15196");
System.out.println("---------------------");
System.out.println("Flight 2: SG-8263"+"\n"+"Duration:10h 35m"+"\n"+"Departure3:20 pm");
System.out.println("Economy: ₹7,633 + Instant booking surplus charges-₹490 only"+"Net charges:₹8123");
System.out.println("Business: ₹15266 + Instant booking surplus charges-₹980 only"+"Net charges:₹16246");
System.out.println("---------------------");
System.out.println("Flight 3: I5-711"+"\n"+"Duration:7h 35m"+"\n"+"Departure- 7:40 pm");
System.out.println("Economy: ₹7,000 + Instant booking surplus charges-₹490 only"+"Net charges:₹7490");
System.out.println("Business: ₹14000 + Instant booking surplus charges-₹980 only"+"Net charges:₹14980");
System.out.println("---------------------");
System.out.println("Cheapest Option: 3");
System.out.println("Fastest Option: 1");
System.out.println("---------------------");
System.out.print("Enter your preference: ");
int choice5= sc.nextInt();
switch(choice5)
{
case 1:
{
System.out.println("You have chosen flight 6E-353."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =7598;
cost2 =15196;
flightName="6E-353";
time="Departure- 1:12 am, Duration- 02h 10m";
break;
}
case 2:
{
System.out.println("You have chosen flight SG-8263."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =8123;
cost2 =16246;
flightName="SG-8263";
time="Departure- 3:20 pm, Duration- 10h 35m";
break;
}
case 3:
{
System.out.println("You have chosen flight I5-711."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =7490;
cost2 =14980;
flightName="I5-711";
time="Departure- 7:40 pm, Duration- 7h 35m";
break;
}
}
}
break;
}
case 2:
{
if (((from==1)&&(to==3))||((from==3)&&(to==1))){
System.out.println("Available tickets are:");
System.out.println("Flight 1: 6E-6798"+"\n"+"Duration:08h 35m"+"\n"+"Departure3:20 am");
System.out.println("Economy: ₹5,200 ");
System.out.println("Business: ₹10,400 ");
System.out.println("---------------------");
System.out.println("Flight 2: 6E-2432"+"\n"+"Duration:07h 15m"+"\n"+"Departure12:00 pm");
System.out.println("Economy: ₹6,210");
System.out.println("Business: ₹12,420 ");
System.out.println("---------------------");
System.out.println("Flight 3: AI-1852"+"\n"+"Duration:7h 35m"+"\n"+"Departure3:00 pm");
System.out.println("Economy: ₹5,850");
System.out.println("Business: ₹11700");
System.out.println("---------------------");
System.out.println("Flight 4: 6E-2279"+"\n"+"Duration:08h 05m"+"\n"+"Departure9:20 am");
System.out.println("Economy: ₹4,670");
System.out.println("Business: ₹9,340");
System.out.println("---------------------");
System.out.println("Cheapest Option: 4");
System.out.println("Fastest Option: 2");
System.out.println("---------------------");
System.out.print("Enter your preference: ");
int choice1= sc.nextInt();
switch(choice1)
{
case 1:{
System.out.println("You have chosen flight 6E-6798."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =5200;
cost2 =10400;
flightName="6E-6798";
time="Departure- 9:20 am, Duration- 08h 35m";
break;
}
case 2:{
System.out.println("You have chosen flight 6E-2432."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =6210;
cost2 =12420;
flightName="6E-2432";
time="Departure- 12:00 pm, Duration- 07h 15m";
break;
}
case 3:{
System.out.println("You have chosen flight AI-1852."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =5850;
cost2 =11700;
flightName="AI-1852";
time="Departure- 3:56 am, Duration- 07h 35m";
break;
}
case 4:{
System.out.println("You have chosen flight 6E-2279."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =4670;
cost2 =9340;
flightName="6E-2279";
time="Departure- 11:20 pm, Duration- 08h 05m";
break;
}
}
}
if (((from==1)&&(to==2))||((from==2)&&(to==1))){
System.out.println("Available tickets are:");
System.out.println("Flight 1: 6E625"+"\n"+"Duration:01h 40m"+"\n"+"Departure- 5:30 am");
System.out.println("Economy: ₹4,578");
System.out.println("Business: ₹9,156");
System.out.println("---------------------");
System.out.println("Flight 2: 6E6745"+"\n"+"Duration:01h 45m"+"\n"+"Departure8:10 pm");
System.out.println("Economy: ₹4,767");
System.out.println("Business: ₹9,534");
System.out.println("---------------------");
System.out.println("Flight 3: SG-611"+"\n"+"Duration:12h 25m"+"\n"+"Departure9:10 am");
System.out.println("Economy: ₹4,500");
System.out.println("Business: ₹9,000");
System.out.println("---------------------");
System.out.println("Cheapest Option: 3");
System.out.println("Fastest Option: 1");
System.out.println("---------------------");
System.out.print("Enter your preference: ");
int choicee= sc.nextInt();
switch(choicee)
{
case 1:
{
System.out.println("You have chosen flight 6E625."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =4578;
cost2 =9156;
flightName="6E625";
time="Departure- 5:30 am, Duration- 01h 40m";
break;
}
case 2:
{
System.out.println("You have chosen flight 6E6745."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =4767;
cost2 =9534;
flightName="6E6745";
time="Departure- 8:10 pm, Duration- 01h 45m";
break;
}
case 3:
{
System.out.println("You have chosen flight SG-611."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =4500;
cost2 =9000;
flightName="SG-611";
time="Departure- 9:56 am, Duration- 12h 25m";
break;
}
}
}
if (((from==1)&&(to==4))||((from==4)&&(to==1))){
System.out.println("Available tickets are:");
System.out.println("Flight 1: I5-975"+"\n"+"Duration:06h 05m"+"\n"+"Departure11:08 am");
System.out.println("Economy: ₹7,245");
System.out.println("Business: ₹14,490");
System.out.println("---------------------");
System.out.println("Flight 2: I5-1533"+"\n"+"Duration:04h 35m"+"\n"+"Departure7:08 pm");
System.out.println("Economy: ₹8,411");
System.out.println("Business: ₹16,822");
System.out.println("---------------------");
System.out.println("Flight 3: 6E-819"+"\n"+"Duration:02h 35m"+"\n"+"Departure9:00 pm");
System.out.println("Economy: ₹6,890");
System.out.println("Business: ₹13,780");
System.out.println("---------------------");
System.out.println("Flight 4: 6E-671"+"\n"+"Duration:02h 05m"+"\n"+"Departure4:00 pm");
System.out.println("Economy: ₹8,900");
System.out.println("Business: ₹17,800");
System.out.println("---------------------");
System.out.println("Cheapest Option: 3");
System.out.println("Fastest Option: 4");
System.out.println("---------------------");
System.out.print("Enter your preference: ");
int choice2= sc.nextInt();
switch(choice2)
{
case 1:{
System.out.println("You have chosen flight I5-975."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =7245;
cost2 =14490;
flightName="I5-975";
time="Departure- 11:08 am, Duration- 06h 05m";
break;
}
case 2:{
System.out.println("You have chosen flight I5-1533."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =8411;
cost2 =16822;
flightName="I5-1533";
time="Departure- 4:09 pm, Duration- 04h 35m";
break;
}
case 3:{
System.out.println("You have chosen flight 6E-819."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =6890;
cost2 =13780;
flightName="6E-819";
time="Departure- 10:40 pm, Duration- 02h 35m";
break;
}
case 4:{
System.out.println("You have chosen flight 6E-671."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =8900;
cost2 =17800;
flightName="6E-671";
time="Departure- 11:00 am, Duration- 02h 05m";
break;
}
}
}
if (((from==2)&&(to==3))||((from==3)&&(to==2))){
System.out.println("Available tickets are:");
System.out.println("Flight 1: 6E-5045"+"\n"+"Duration:02h 50m"+"\n"+"Departure5:45 pm");
System.out.println("Economy: ₹5,939");
System.out.println("Business: ₹11,878");
System.out.println("---------------------");
System.out.println("Flight 2: UK-832"+"\n"+"Duration:02h 35m"+"\n"+"Departure8:17 am");
System.out.println("Economy: ₹7,767");
System.out.println("Business: ₹15,534");
System.out.println("---------------------");
System.out.println("Flight 3: SG-8947"+"\n"+"Duration:02h 05m"+"\n"+"Departure3:10 am");
System.out.println("Economy: ₹7,009");
System.out.println("Business: ₹14,018");
System.out.println("---------------------");
System.out.println("Cheapest Option: 1");
System.out.println("Fastest Option: 3");
System.out.println("---------------------");
System.out.print("Enter your preference: ");
int choice3= sc.nextInt();
switch(choice3)
{
case 1:{
System.out.println("You have chosen flight 6E-5045."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =5939;
cost2 =11878;
flightName="6E-5045";
time="Departure- 5:45 pm, Duration- 02h 50m";
break;
}
case 2:{
System.out.println("You have chosen flight UK-832."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =7767;
cost2 =15534;
flightName="UK-832";
time="Departure- 3:17 am, Duration- 02h 35m";
break;
}
case 3:
{
System.out.println("You have chosen flight SG-8947."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =7009;
cost2 =14018;
flightName="SG-8947";
time="Departure- 1:40 am, Duration- 02h 05m";
break;
}
}
}
if (((from==2)&&(to==4))||((from==4)&&(to==2))){
System.out.println("Available tickets are:");
System.out.println("Flight 1: I5-611"+"\n"+"Duration:03h 40m"+"\n"+"Departure4:50 am");
System.out.println("Economy: ₹7,619");
System.out.println("Business: ₹15,238");
System.out.println("---------------------");
System.out.println("Flight 2: AI-786"+"\n"+"Duration:01h 50m"+"\n"+"Departure8:15 pm");
System.out.println("Economy: ₹8,115");
System.out.println("Business: ₹16,320");
System.out.println("---------------------");
System.out.println("Flight 3: IX-1645"+"\n"+"Duration:02h 00m"+"\n"+"Departure12:15 am");
System.out.println("Economy: ₹8,000");
System.out.println("Business: ₹16,000");
System.out.println("---------------------");
System.out.println("Cheapest Option: 1");
System.out.println("Fastest Option: 2");
System.out.println("---------------------");
System.out.print("Enter your preference: ");
int choice4= sc.nextInt();
switch(choice4)
{
case 1:{
System.out.println("You have chosen flight I5-6111."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =7619;
cost2 =15238;
flightName="I5-611";
time="Departure- 4:50 am, Duration- 03h 40m";
break;
}
case 2:{
System.out.println("You have chosen flight AI-786."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =8115;
cost2 =16320;
flightName="AI-786";
time="Departure- 8:15 pm, Duration- 01h 50m";
break;
}
case 3:{
System.out.println("You have chosen flight IX-1645."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =8000;
cost2 =16000;
flightName="IX-1645";
time="Departure- 3:33 pm, Duration- 02h 00m";
break;
}
}
}
if (((from==3)&&(to==4))||((from==4)&&(to==3))){
System.out.println("Available tickets are:");
System.out.println("Flight 1: 6E-353"+"\n"+"Duration:02h 10m"+"\n"+"Departure1:12 am");
System.out.println("Economy: ₹7,108");
System.out.println("Business: ₹14,216");
System.out.println("---------------------");
System.out.println("Flight 2: SG-8263"+"\n"+"Duration:10h 35m"+"\n"+"Departure3:20 pm");
System.out.println("Economy: ₹7,633");
System.out.println("Business: ₹15,266");
System.out.println("---------------------");
System.out.println("Flight 3: I5-711"+"\n"+"Duration:7h 35m"+"\n"+"Departure- 8:20 pm");
System.out.println("Economy: ₹7,000");
System.out.println("Business: ₹14,000");
System.out.println("---------------------");
System.out.println("Cheapest Option: 3");
System.out.println("Fastest Option: 1");
System.out.println("---------------------");
System.out.print("Enter your preference: ");
int choice5= sc.nextInt();
switch(choice5)
{
case 1:{
System.out.println("You have chosen flight 6E-353."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =7108;
cost2 =14216;
flightName="6E-353";
time="Departure- 1:12 am, Duration- 02h 10m";
break;
}
case 2:{
System.out.println("You have chosen flight SG-8263."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =7633;
cost2 =15266;
flightName="SG-8263";
time="Departure- 3:20 pm, Duration- 10h 35m";
break;
}
case 3:{
System.out.println("You have chosen flight I5-711."+"\n"+"Welcome Aboard!"+"\n"+"Please proceed to book ticket.");
cost1 =7000;
cost2 =14000;
flightName="I5-711";
time="Departure- 7:40 pm, Duration- 7h 35m";
break;
}
}
}
break;
}
}
}
void customerDeatils(){
long num;
int k;
flag=1;
System.out.print("Enter name:");
name=sc.next();
System.out.print("Enter 8 digit Aadharcard number:");
adharNumber=sc.nextLong();
do
{
flag=1;
num=adharNumber;
k=0;
while(num!=0)
{
num=num/10;
++k;
}
if(k!=8)
{
System.out.println("Enter valid Aadharcard number:");
adharNumber=sc.nextLong();
}
else
{
flag=0;
}
}while(flag==1);
System.out.print("Enter your email id:");
email=sc.next();
do
{
for(int i=0;i<email.length();i++)
{
	if(email.charAt(i)=='.'||email.charAt(i)=='@')
	{
		 e++;
	}
}
if(e<2)
{
	System.out.println("Enter A valid email ID");
	email=sc.next();
	
}
}while(e<2);
System.out.print("Enter your 9 digit contact number:");
contactNumber=sc.nextInt();
do
{
flag=1;
num=contactNumber;
k=0;
while(num!=0)
{
num=num/10;
++k;
}
if(k!=9)
{
System.out.println("Enter valid contact number");
contactNumber=sc.nextLong();
}
else
{
flag=0;
}
}while(flag==1);
System.out.println("Enter age"+"\nIf the passengers age is less than one year the passenger will be regarded as an infant and enter his/her age as 0");
age=sc.nextInt();
if(age>=18)
{
customerType="Adult";
}
if(age>=1&&age<=17)
{
customerType="Child";
}
if(age<1)
{
customerType="Infant";
}
System.out.println(customerType);
System.out.print("Enter your gender:");
gender=sc.next();
System.out.println("Are you Physically Challenged? \nEnter \n1: Yes\n2: No");
physicallyChallenged=sc.nextInt();
if(physicallyChallenged==1)
{
System.out.println("Do You require any assistance? \nEnter \n1: Yes\n2: No");
physicallyChallengedType=sc.nextInt();
if(physicallyChallengedType==1)
{
System.out.println("Our Employee will be present to assist you (+500 extra fees)");
System.out.println("Do You Require wheel chair? \nEnter \n1: Yes\n2: No");
wheelChair=sc.nextInt();
if(wheelChair==1)
{
System.out.println("You are required to pay Rs149 towards the airlines\nThank You!!");
}
else
{
System.out.println("Thank You!");
}
}
}
}
void TermsAndConditions()
{
System.out.println(" .....Terms and Conditions..... ");
System.out.println("1. Baggage Allowance:");
System.out.println("A. Economy Class: Typically allows 1 checked bag up to 23 kg and a carry on bagup to 7 kg.");
System.out.println("B. Business Class: Usually permits 2 checked bags up to 32 kg each and a carry on bag up to 7 kg.");
System.out.println("2. Identification Required for Flights:a government issued photo ID like aadhar card, passport or driving licence is necessary for identification.");
System.out.println("3. Check in time is 45 minutes before departure.");
System.out.println("4. Passengers must follow the instructions of the flight crew, remain seated with seatbelts fastened when required, and not interfere with the crew’s duties.");
System.out.println("5. Smoking, using electronic devices during takeoff or landing, and consuming alcohol not provided by the airline are not allowed.");
System.out.println("6. Vaccination certificates required before travel");
System.out.println("7. Accommodation for passengers with special needs is provided. Extra fees will be charged at time of boarding according");
System.out.println("8. Airlines collect personal information such as name, contact details,and travel preferences.This information is used for booking management,improving service quality,and sometimes for marketing purposes,with the passenger’s consent.");
}
}
class VoyageAirlines {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n=0,i,flag=1;
String[] bookedSeats = new String[10];
BookingDetails flight = new BookingDetails();
flight.flightDetails();
BookingDetails customer[]=new BookingDetails[10];
System.out.print("Enter number of seats you want to book:");
n=in.nextInt();
for(i=0;i<n;i++)
{
customer[i]=new BookingDetails();
customer[i].customerDeatils();
}
flight.TermsAndConditions();
int choice=0;
do
{
System.out.println("Enter the type of seat (Economy/Business) you want to book");
System.out.println("Enter\n1: Economy class \n2: Business class");
choice=in.nextInt();
switch(choice)
{
case 1:
{
int j, p = 0;
i=0;
String arr[][] = new String[8][8];
for (i = 0; i < 8; i++) {
for (j = 0; j < 8; j++) {
arr[i][j] = "";
}
}
System.out.println("Seat Matrix of airplane:");
for (j = 0; j < 8; j++) {
p++;
for (i = 0; i < 8; i++) {
if (i == 2 || i == 5) {
arr[i][j] = " ";
System.out.print(arr[i][j]);
} else {
char c = (char) (i + 65);
String k = Integer.toString(j + 1);
arr[i][j] = c + k;
System.out.print("[" + arr[i][j] + "]");
}
}
System.out.println();
}
// Array to store booked seats
System.out.println("Enter the seat to be booked:");
for (int h = 0; h < n; h++) {
String s = in.next();
bookedSeats[h] = s;
int R = s.charAt(0) - 'A';
int C = Integer.parseInt(s.substring(1)) - 1;
arr[R][C] = "* ";
}
System.out.println("Final Seat Matrix of airplane:");
p = 0;
for (j = 0; j < 8; j++) {
p++;
for (i = 0; i < 8; i++) {
if (i == 2 || i == 5) {
arr[i][j] = " ";
System.out.print(arr[i][j]);
} else {
System.out.print("[" + arr[i][j] + "]");
}
}
System.out.println();
}
System.out.println("Thank You!!!\nYour Seat/s have been confirmed in Economy Class");
break;
}
case 2:
{
int j, p = 0;
i=0;
String arr[][] = new String[8][8];
for (i = 0; i < 5; i++) {
for (j = 0; j < 5; j++) {
arr[i][j] = "";
}
}
System.out.println("Seat Matrix of airplane:");
for (j = 0; j < 5; j++) {
p++;
for (i = 0; i < 5; i++) {
if (i == 2) {
arr[i][j] = " ";
System.out.print(arr[i][j]);
} else {
char c = (char) (i + 65);
String k = Integer.toString(j + 1);
arr[i][j] = c + k;
System.out.print("[" + arr[i][j] + "]");
}
}
System.out.println();
}
// Array to store booked seats
System.out.println("Enter the seat to be booked:");
for (int h = 0; h < n; h++) {
String s = in.next();
bookedSeats[h] = s;
int R = s.charAt(0) - 'A';
int C = Integer.parseInt(s.substring(1)) - 1;
arr[R][C] = "* ";
}
System.out.println("Final Seat Matrix of airplane:");
p = 0;
for (j = 0; j < 5; j++) {
p++;
for (i = 0; i < 5; i++) {
if (i == 2) {
arr[i][j] = " ";
System.out.print(arr[i][j]);
} else {
System.out.print("[" + arr[i][j] + "]");
}
}
System.out.println();
}
System.out.println("Thank You!!!\nYour Seat/s have been confirmed in Business Class");
break;
}
default:
{
System.out.println("OOPS!! Your entered choice doesn't match with the options");
}
}
}while(choice!=1&&choice!=2);
//Transaction
int cost=0, o=0,ch=0,no,d,m,y,cvv,num,k1,c1=1,x,z,a=1;
if(choice==1)
{
cost=flight.cost1;
}
else
{
cost=flight.cost2;
}
int amount= cost*n;
System.out.println("The Amount to be paid is: ₹"+amount);
System.out.println("Do you want to proceed with transaction? \nEnter \n1: Yes\n2: No");
System.out.println("By selecting yes you agree to our terms and conditions");
o=in.nextInt();
switch(o)
{
case 1:
{
System.out.println("Select you payment mode");
System.out.println("1.Debit card/Credit card\n2.UPI");
System.out.print("Enter your choice:");
ch=in.nextInt();
if(ch==1)
{
System.out.print("Enter your 8 digit card number:");
no=in.nextInt();
do
{
num=no;
k1=0;
while(num!=0)
{
num=num/10;
++k1;
}
if(k1!=8)
{
System.out.println(k1);
System.out.print("Enter valid card number");
no=in.nextInt();
}
else
{
c1=0;
}
}while(c1!=0);
System.out.println("Enter expiry date in dd/mm/yyyy format one by one");
d=in.nextInt();
m=in.nextInt();
y=in.nextInt();
System.out.print("Enter your 4 digit cvv:");
cvv=in.nextInt();
System.out.println("PAYMENT SUCCESSFUL!!!!!");
System.out.println("Payment of ₹"+amount+" received toward VOYAGE airlines");
}
if(ch==2)
{
long uno;
System.out.println("Enter your UPI Number:");
uno=in.nextLong();
do
{
flag=1;
long numm=uno;
int k = 0;
while(numm!=0)
{
numm=numm/10;
++k;
}
if(k!=9)
{
System.out.print("Enter 9 digit contact number:");
uno=in.nextLong();
}
else
{
flag=0;
}
}while(flag==1);
System.out.println("A payment request of ₹"+ amount+" has been sent on your UPI app");
System.out.println("Perform the next procedure on your app and enter the transaction ID here within 20 sec");
for(i=0;i<=20;i++)
{
System.out.print(" ");
if(i==20)
{
System.out.println("20 sec are done");
}
}
System.out.print("Enter your transaction code:");
int code=in.nextInt();
do
{
x=code;
z=0;
while(x!=0)
{
x=x/10;
++z;
}
if(z!=4)
{
System.out.println("Enter valid Transaction code!");
code=in.nextInt();
}
else
{
a=0;
System.out.println("PAYMENT SUCCESSFUL!!!!");
System.out.println("Payment of ₹"+amount+" received toward VOYAGE airlines through UPI");
}
}while(a!=0);
}
}
case 2:
{
System.out.println("Thanks for using our services hope to see you again soon!!");
break;
}
}
if(o==1)
{String from="null",to="null";
if(flight.from==1)
{
from ="Pune(PNQ)";
}
else if(flight.from==2)
{
from = "Chenni(MAA)";
}
else if(flight.from==3)
{
from = "Delhi(DEL)";
}
else if(flight.from==4)
{
from ="Kolkata(CCU)";
}
if(flight.to==1)
{
to ="Pune(PNQ)";
}
else if(flight.to==2)
{
to = "Chenni(MAA)";
}
else if(flight.to==3)
{
to = "Delhi(DEL)";
}
else if(flight.to==4)
{
to ="Kolkata(CCU)";
}
String text2[] = new String[n],text8[] = new String[n];
String text1 = "Voyage Airlines",text3 = "Date: "+flight.day+"/"+flight.month+"/"+flight.year;
String text5 = "Flight name: "+flight.flightName,text4="Timing: "+flight.time,text6 = "From: "+from, text7 = "To: "+to,text9 ="Barcode: ||||| || |||| ||| |";
String UniqueCode , text10 = "Flight type: Domestic";
for(int e=0;e<n;e++)
{
text8[e] = "Seat Number: "+bookedSeats[e];
UniqueCode = "UniqueCode: VOY"+customer[e].name.substring(0,3)+text8[e].substring(13,15);
text2[e]="Name:"+customer[e].name;
int rows = 10, columns = 80;
int textspacer1 = (columns-text1.length())/2;
for (i = 1; i <= rows; i++) {
for (int j = 1; j <= columns; j++) {
if (i == 1 || i == rows) {
System.out.print("*");
}
else if(j==1)
{
System.out.println("|                                                                           |");
}
else if(i==2 && j == textspacer1)
{
System.out.print(text1);
}
else if(i==3 && j ==4)
{
System.out.print(text5+" "+text3+" "+text6+" "+text7);
}
else if(i==4 && j==4 )
{
System.out.print(text4+" "+text10);
}
else if(i==5 && j==4 )
{
System.out.print(text9);
}
else if(i==6 && j==4 )
{
System.out.print(text2[e]+" "+UniqueCode);
}
else if(i==7 && j==4 )
{
System.out.print(text8[e]);
}
else if(i==8 && j==4 )
{
System.out.print("Booking status: Confirmed Date of Booking: 11/03/2024 Payment: Successful");
}
else if(i==9 && j==6 )
{
System.out.print(" Thanks for using our services ");
}
else
{
System.out.print(" ");
}
}
System.out.println(); // Move to the next line
}
in.close();
}
}
}
}