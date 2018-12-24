TOPIC:-Durga JDBC Video 1
--------
VIDEO NO=1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26
--------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------

IMPORTANT EXAMPLES:-

----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
Stand Alone Application:-

Stand Alone Application are 2 types

GUI(graphical user interface application) --->calculator,ms word,paint..
CUI(charcter user interface application.) --->The programes which  we are running from command prompt.


If we are having knoweldge  on core java we can develop only Stand alone applicaiton which is only 5%.

If we having knoweldge on Advance java we can develop web application like FB,rail.
These web application can be placed in the server and run in real time..

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
Page 4 video 2.

If we enter username and password(jsp)

The request will go the server(servlet).In that it will process the information.
  That is reading data from the jsp  page and checking with database wheather the data is valid  or not.
  If valid what we need to do and invalid what we need to do...(All processing logics can be done here.) (SERVLET).
(This servlet might take help from java classes sometimes they are called viewModel classes).

Then it wiil communictae with Database(JDBC).


JSP:-java server page.
Ex:-login page,error page,inbox page.

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
Video 3

In Java there are 3 Editions are available
1. Java Standard Edition (JSE | J2SE)   //JDBC is the Part of JSE + core java.
2. Java Enterprise Edition (JEE | J2EE) //Servlets and JSP's are the Part of JEE
3. Java Micro Edition (JME | J2ME)  //Mobile application and embded applications.




***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
Video 4
Video 5

1) Temporary Storage Areas
2) Permanent Storage Areas also known as persistent storage areas.


Video 6
Video 7

JDBC API is Standard API. We can communicate with any Database without rewriting our
Application i.e. it is Database Independent API.

The programe written for oracle database can be modified to communicate with mysql databse.

that connection ,con and all Result set and row set all will be of same syntax..

Video 8
ODBC open database connectivity.


Evolution of JDBC---> Page 10 in old days for every applicaiton we need to communicate to different databse then we have to write 
a separate application once again...

It s like CDMA phone...


After microsoft introduced ODBC for every database specific we can use separate driver.There is no need of writing
a separate application for each time ..

Its like GSM mobile.

Video 9

Video 10

Driver Manager :-
Java application can communicate with DriverManager.
DriverManager is provide by JDBC API.


Video 11

java programe when compiled it will generate the byte code.that is .class file i guess..

this .class file can be runned in any platform like mac,linux,and windows becauses..

these mac,linux and windows will download that corresponding JDK and JVM.

i.e mac downloaded JDK will convert windows compiled  .class file(i.e byte code) to run it.

Java is platform Indepedent.
JVM is platform Depedent.

Java is platform Indepedent bocoz of JVM platform depedency.
Java DBC is platform Indepedent Bcoz of Driver Software.

Video 12.
Video 13.
jar file --->contains a group a .class file..
That is group of java archieve file.

Video 14
Video 15
Video 16
Type-2 Driver:
When compared with Type-1 Driver, Portability is more because Type-1 Driver is applicable only
for Windows Machines.

But Durga told that if we use specific Native libraries for corresponding platform we can use Type 2 libraries.

Video 17

Type -3 Driver
This Driver is most commonly used in all industry standard.
Type -3 Driver is completely Developed in java so its indepedent.

Video 18
Type 4 Driver.
Performance is more Bcoz the conversion is less.

Video 19

Video 20
2. If we are using multiple Databases in our Application then Type-3 Driver is recommended to
use.

Eg: Large Scale Web Applications and Enterprise Applications(Real time Applicaiton like Airtel and others)

Maintaining Multiple database for Aitel company like Bill information in one Database.
Customer information in one Database..


Video 21
Page 4 Advance Java Notes (Diagram).
Tier Architecture not explained in this video..

Video 22
Tier architecture explained in this video.
If we see the block diagram of the Drivers..
It is divided into 2 Blocks...
That is 
1)Clinet Machine 
2)Database Engine..

Type 1,2,4 driver Block diagram has
client Machine and Database so 2 Tier architecture.

Type 3 driver Block diagram has
client Machine ,Middleware Server, Database so 3 Tier architecture.

Video 23


Video 24 

Page 4 Notes.

Standard Steps for developing JDBC Application
1. Load and register Driver Class
2. Establish Connection between Java Application and Database
3. Create Statement Object // Once the connection is ready we need to create a statement Object to send and execute sql a Querey.so create a statement Object.
4. Send and execute SQL Query
5. Process Result from ResultSet //Bcoz we are getting Results from the SQL querey in the form of ResultSet.
6. Close Connection



Load and Regiser Driver Class..

1)Driver Software is usually avaliable in the form of JarFiles.

So we have to make this Jar files( i.e Driver Softwware) avaliable to java programe.
so to achieve that we are placing  that corresponding jar file  inside class path.
 
 To work with any Driver we need to make sure of 2 things..
 1)Driver  software /jar file is avaliable in the class path.
 2)Load and register the corresponding class..


 To load the Driver class we use class.forname("sun.jdbc.odbc.JdbcOdbcDriver").



 Extra Points:-
 Every Driver Software is avaliable in the form of jar files.

***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
Static Block execution code.

PROGRAME=5
=========
EXPLANATION:-
============
class Test 
{

	static{	System.out.println("Static Block executed");}
	public static void main(String[] args) throws Exception //some exception will be raised so i am not interested in handiling so that i will use Exception.
	{
		System.out.println("Hello World!");
	}
}

Microsoft Windows [Version 10.0.17134.165]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
Static Block executed
Hello World!

C:\Users\vinay.ts\Desktop>


How to set path..

set path= <javac locaion//no "">

when ever we are loading Driver class.
Inside Driver class static block is there...
class JdbcOdbcDriver
{
	static
	{
	   JdbcOdbcDriver jdbc=new JdbcOdbcDriver();
	   DriverManager.registerDriver(jdbc);
	}
}

Because of this Static Block, whenever we are loading automatically registering with
DriverManager will be happened. Hence we are not required to perform this activity explicitly.


During JDBC frist task is
Load and register the driver class.
It has been done internally by static block we are executing the static Block..
We can do it manully also, but we don t want to it so we are using class.forname();

Internally we can find this code in Type -1 Driver..
Jdk-Jre-lib-rt.jar.

By using Dcompiler extract the rt.jar  and open.class file  to .java then we can see the below code..
class JdbcOdbcDriver
{
	static
	{
	   JdbcOdbcDriver jdbc=new JdbcOdbcDriver();
	   DriverManager.registerDriver(jdbc);
	}
}

Procedure is 
copy the rt.jar file and extract it.
now in rt folder go to sun\jdbc\odbc\
In that open JdbcOdbcDriver .class file into java file we will get the code..

***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
EXPLANATION:-
============
28/09/2018

Video 26  // 40 mins.

Reason for passing the url and password..

using url we can go untill www.gmail.com.
But if we want to communicate with DB we need user name and password.

Default username oracle---> username = scott and password = tiger.
Mysql---------------------> username =root and password=root.


For Type 1 Driver we have to configure DSN  ------------>   jdbc:odbc:demodsn


configuring DSN:-We can configure dsn in windows XP.
we cannot configure dsn in new machines like windows 10,7,8.
For DSN we cannot configure dsn in windows 10,7,8.

PDF page 28.

Microsoft ODBC for Oracle setup.

Data Source Name      // optional .what ever we provide here the same thing should be used in java programe.
Description           //optional 
User Name             //scott
Server               //If the DataBase server is locating in some other machine ,then it is reuired.
                     //If the databse is locating in the same system then it is not reuired..



JDBC URL syntax...
<mainprotocol> : <subprotocol> : <subname>         //In this mainprotocol is always JDBC for all Type 1- to Type -4 Driver.
Always JDBC Driver Protocol Driver Connection   

***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
import java.sql.*;
public class DbConnectDemo1
{
public static void main(String[] args) throws Exception
{
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  Connection con=DriverManager.getConnection("jdbc:odbc:demodsn7","scott","tiger");

if(con != null)
{
 System.out.println("Connection established Successfully");
 }
 else
 {
 System.out.println("Connection not established");
 }
 }
 }

EXPLANATION:-
============
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");   //Load and Register driver class code..
												//optional from JDBC 4.0 version onwards. 
												//If we comment also it will  connect to the DataBase.

Connection con=DriverManager.getConnection("jdbc:odbc:demodsn7","scott","tiger");  //Establish connection between DriverManager and DataBase.

See this explanation u will know why they will use this type of condition  inside if  ------>   con != null


(25:00 to 28:00  timings in that Durga will take this condition .In  notes one type of condition but in Durga explanation 
another type of condition)

if(con == null)     // see here 
{
 System.out.println("Connection not  established ");
 }
else
 {
 System.out.println("Connection established Successfully");
 }
-------------------------------------------------------------------------
if(con != null)    //compare here with previous  if
{
 System.out.println("Connection established Successfully");
 }
 else
 {
 System.out.println("Connection not established");
 }


 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  //There may be a class not found Exception..
 Connection con=DriverManager.getConnection("jdbc:odbc:demodsn7","scott","tiger"); //There may be a chance for sql exceptionn 
																				  //To handle all this we use throws keyword.

Connection con=DriverManager.getConnection("jdbc:odbc:demodsn7","scott","tiger"); // They are present in java.sql.*; 
                                                                                  //so import it..

***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
EXPLANATION:-
============
For interface we cannot create Object.
Connection is an interface...?
then how can we create an Object for the connection..?
We are not getting Connection interface Object, and we are getting its Implementated Class Object.


To prove this we can use one logic..
If we have the Object  reference,then we can get to know the corresponding class name by using
Sop(con.getClass().getName());  //we will get internal implemented class name..
o/p: sun.jdbc.odbc.JdbcOdbcConnection

---------------------------------------------------------------------------------------------
40:00
Here we can use directly the implemented class Object what is the advantage of using interface and then using implemented class Object...?

Implementation class name also we can create Connection Object and its valid..

sun.jdbc.odbc.JdbcOdbcConnection  con=(sun.jdbc.odbc.JdbcOdbcConnection)DriverManager.getConnection("jdbc:odbc:demodsn7","scott","tiger");  //valid it will work.


***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
EXPLANATION:-
============

Reason to go for interface implemented JDBC API see this..

If i use interface implemented class Object..
Connection con=DriverManager.getConnection("jdbc:odbc:demodsn7","scott","tiger"); 
In this code if i changed to Type 1 ,2,3,4 or changed to oracle,mysql,sysbase.
I need to change only in the argument of the line ---->("jdbc:odbc:demodsn7","scott","tiger"); 


If i directy use implemented class Object..
sun.jdbc.odbc.JdbcOdbcConnection  con=(sun.jdbc.odbc.JdbcOdbcConnection)DriverManager.getConnection("jdbc:odbc:demodsn7","scott","tiger");  
In this code if i changed to Type 1 ,2,3,4 or changed to oracle,mysql,sysbase.
then i need to change all the below mentioned in this...

sun.jdbc.odbc.JdbcOdbcConnection  con=(sun.jdbc.odbc.JdbcOdbcConnection)DriverManager.getConnection("jdbc:odbc:demodsn7","scott","tiger");  
      //change here									   //change here										   //change here 
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
PROGRAME=16
=========
EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
EXPLANATION:-
============
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
EXPLANATION:-
============
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
=========
EXPLANATION:-
============
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
PROGRAME=20
=========
EXPLANATION:-
============
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
PROGRAME=21
=========
EXPLANATION:-
============
***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:-
-----
PROGRAME=22
=========
EXPLANATION:-
============
***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-
-----
PROGRAME=23
=========
EXPLANATION:-
============
***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----
PROGRAME=24
=========
EXPLANATION:-
============
***************************-----END of--->24<--------***************************
Example=25
=========
NOTE:-
-----
PROGRAME=25
=========
EXPLANATION:-
============
***************************-----END of--->25<--------***************************
Example=26
=========
NOTE:-
-----
PROGRAME=26
=========
EXPLANATION:-
============
***************************-----END of--->26<--------***************************
Example=27
=========
NOTE:-
-----
PROGRAME=27
=========
EXPLANATION:-
============
***************************-----END of--->27<--------***************************
Example=28
=========
NOTE:-
-----
PROGRAME=28
=========
EXPLANATION:-
============
***************************-----END of--->28<--------***************************
Example=29
=========
NOTE:-
-----
PROGRAME=29
=========
EXPLANATION:-
============
***************************-----END of--->29<--------***************************
Example=30
=========
NOTE:-
-----
PROGRAME=30
=========
EXPLANATION:-
============
***************************-----END of--->30<--------***************************
Example=31
=========
NOTE:-
-----
PROGRAME=31
=========
EXPLANATION:-
============
***************************-----END of--->31<--------***************************
Example=32
=========
NOTE:-
-----
PROGRAME=32
=========
EXPLANATION:-
============
***************************-----END of--->32<--------***************************
Example=33
=========
NOTE:-
-----
PROGRAME=33
=========
EXPLANATION:-
============
***************************-----END of--->33<--------***************************
Example=34
=========
NOTE:-
-----
PROGRAME=34
=========
EXPLANATION:-
============
***************************-----END of--->34<--------***************************
Example=35
=========
NOTE:-
-----
PROGRAME=35
=========
EXPLANATION:-
============
***************************-----END of--->35<--------***************************
Example=36
=========
NOTE:-
-----
PROGRAME=36
=========
EXPLANATION:-
============
***************************-----END of--->36<--------***************************
Example=37
=========
NOTE:-
-----
PROGRAME=37
=========
EXPLANATION:-
============
***************************-----END of--->37<--------***************************
Example=38
=========
NOTE:-
-----
PROGRAME=38
=========
EXPLANATION:-
============
***************************-----END of--->38<--------***************************
Example=39
=========
NOTE:-
-----
PROGRAME=39
=========
EXPLANATION:-
============
***************************-----END of--->39<--------***************************
Example=40
=========
NOTE:-
-----
PROGRAME=40
=========
EXPLANATION:-
============
***************************-----END of--->40<--------***************************
Example=41
=========
NOTE:-
-----
PROGRAME=41
=========
EXPLANATION:-
============
***************************-----END of--->41<--------***************************
Example=42
=========
NOTE:-
-----
PROGRAME=42
=========
EXPLANATION:-
============
***************************-----END of--->42<--------***************************
Example=43
=========
NOTE:-
-----
PROGRAME=43
=========
EXPLANATION:-
============
***************************-----END of--->43<--------***************************
Example=44
=========
NOTE:-
-----
PROGRAME=44
=========
EXPLANATION:-
============
***************************-----END of--->44<--------***************************
Example=45
=========
NOTE:-
-----
PROGRAME=45
=========
EXPLANATION:-
============
***************************-----END of--->45<--------***************************
Example=46
=========
NOTE:-
-----
PROGRAME=46
=========
EXPLANATION:-
============
***************************-----END of--->46<--------***************************
Example=47
=========
NOTE:-
-----
PROGRAME=47
=========
EXPLANATION:-
============
***************************-----END of--->47<--------***************************
Example=48
=========
NOTE:-
-----
PROGRAME=48
=========
EXPLANATION:-
============
***************************-----END of--->48<--------***************************
Example=49
=========
NOTE:-
-----
PROGRAME=49
=========
EXPLANATION:-
============
***************************-----END of--->49<--------***************************
Example=50
=========
NOTE:-
-----
PROGRAME=50
=========
EXPLANATION:-
============
***************************-----END of--->50<--------***************************
Example=51
=========
NOTE:-
-----
PROGRAME=51
=========
EXPLANATION:-
============
***************************-----END of--->51<--------***************************
Example=52
=========
NOTE:-
-----
PROGRAME=52
=========
EXPLANATION:-
============
***************************-----END of--->52<--------***************************
Example=53
=========
NOTE:-
-----
PROGRAME=53
=========
EXPLANATION:-
============
***************************-----END of--->53<--------***************************
Example=54
=========
NOTE:-
-----
PROGRAME=54
=========
EXPLANATION:-
============
***************************-----END of--->54<--------***************************
Example=55
=========
NOTE:-
-----
PROGRAME=55
=========
EXPLANATION:-
============
***************************-----END of--->55<--------***************************
Example=56
=========
NOTE:-
-----
PROGRAME=56
=========
EXPLANATION:-
============
***************************-----END of--->56<--------***************************
Example=57
=========
NOTE:-
-----
PROGRAME=57
=========
EXPLANATION:-
============
***************************-----END of--->57<--------***************************
Example=58
=========
NOTE:-
-----
PROGRAME=58
=========
EXPLANATION:-
============
***************************-----END of--->58<--------***************************
Example=59
=========
NOTE:-
-----
PROGRAME=59
=========
EXPLANATION:-
============
***************************-----END of--->59<--------***************************
Example=60
=========
NOTE:-
-----
PROGRAME=60
=========
EXPLANATION:-
============
***************************-----END of--->60<--------***************************
Example=61
=========
NOTE:-
-----
PROGRAME=61
=========
EXPLANATION:-
============
***************************-----END of--->61<--------***************************
Example=62
=========
NOTE:-
-----
PROGRAME=62
=========
EXPLANATION:-
============
***************************-----END of--->62<--------***************************
Example=63
=========
NOTE:-
-----
PROGRAME=63
=========
EXPLANATION:-
============
***************************-----END of--->63<--------***************************
Example=64
=========
NOTE:-
-----
PROGRAME=64
=========
EXPLANATION:-
============
***************************-----END of--->64<--------***************************
Example=65
=========
NOTE:-
-----
PROGRAME=65
=========
EXPLANATION:-
============
***************************-----END of--->65<--------***************************
Example=66
=========
NOTE:-
-----
PROGRAME=66
=========
EXPLANATION:-
============
***************************-----END of--->66<--------***************************
Example=67
=========
NOTE:-
-----
PROGRAME=67
=========
EXPLANATION:-
============
***************************-----END of--->67<--------***************************
Example=68
=========
NOTE:-
-----
PROGRAME=68
=========
EXPLANATION:-
============
***************************-----END of--->68<--------***************************
Example=69
=========
NOTE:-
-----
PROGRAME=69
=========
EXPLANATION:-
============
***************************-----END of--->69<--------***************************
Example=70
=========
NOTE:-
-----
PROGRAME=70
=========
EXPLANATION:-
============
***************************-----END of--->70<--------***************************
Example=71
=========
NOTE:-
-----
PROGRAME=71
=========
EXPLANATION:-
============
***************************-----END of--->71<--------***************************
Example=72
=========
NOTE:-
-----
PROGRAME=72
=========
EXPLANATION:-
============
***************************-----END of--->72<--------***************************
Example=73
=========
NOTE:-
-----
PROGRAME=73
=========
EXPLANATION:-
============
***************************-----END of--->73<--------***************************
Example=74
=========
NOTE:-
-----
PROGRAME=74
=========
EXPLANATION:-
============
***************************-----END of--->74<--------***************************
Example=75
=========
NOTE:-
-----
PROGRAME=75
=========
EXPLANATION:-
============
***************************-----END of--->75<--------***************************
Example=76
=========
NOTE:-
-----
PROGRAME=76
=========
EXPLANATION:-
============
***************************-----END of--->76<--------***************************
Example=77
=========
NOTE:-
-----
PROGRAME=77
=========
EXPLANATION:-
============
***************************-----END of--->77<--------***************************
Example=78
=========
NOTE:-
-----
PROGRAME=78
=========
EXPLANATION:-
============
***************************-----END of--->78<--------***************************
Example=79
=========
NOTE:-
-----
PROGRAME=79
=========
EXPLANATION:-
============
***************************-----END of--->79<--------***************************
Example=80
=========
NOTE:-
-----
PROGRAME=80
=========
EXPLANATION:-
============
***************************-----END of--->80<--------***************************
Example=81
=========
NOTE:-
-----
PROGRAME=81
=========
EXPLANATION:-
============
***************************-----END of--->81<--------***************************
Example=82
=========
NOTE:-
-----
PROGRAME=82
=========
EXPLANATION:-
============
***************************-----END of--->82<--------***************************
Example=83
=========
NOTE:-
-----
PROGRAME=83
=========
EXPLANATION:-
============
***************************-----END of--->83<--------***************************
Example=84
=========
NOTE:-
-----
PROGRAME=84
=========
EXPLANATION:-
============
***************************-----END of--->84<--------***************************
Example=85
=========
NOTE:-
-----
PROGRAME=85
=========
EXPLANATION:-
============
***************************-----END of--->85<--------***************************
Example=86
=========
NOTE:-
-----
PROGRAME=86
=========
EXPLANATION:-
============
***************************-----END of--->86<--------***************************
Example=87
=========
NOTE:-
-----
PROGRAME=87
=========
EXPLANATION:-
============
***************************-----END of--->87<--------***************************
Example=88
=========
NOTE:-
-----
PROGRAME=88
=========
EXPLANATION:-
============
***************************-----END of--->88<--------***************************
Example=89
=========
NOTE:-
-----
PROGRAME=89
=========
EXPLANATION:-
============
***************************-----END of--->89<--------***************************
Example=90
=========
NOTE:-
-----
PROGRAME=90
=========
EXPLANATION:-
============
***************************-----END of--->90<--------***************************
Example=91
=========
NOTE:-
-----
PROGRAME=91
=========
EXPLANATION:-
============
***************************-----END of--->91<--------***************************
Example=92
=========
NOTE:-
-----
PROGRAME=92
=========
EXPLANATION:-
============
***************************-----END of--->92<--------***************************
Example=93
=========
NOTE:-
-----
PROGRAME=93
=========
EXPLANATION:-
============
***************************-----END of--->93<--------***************************
Example=94
=========
NOTE:-
-----
PROGRAME=94
=========
EXPLANATION:-
============
***************************-----END of--->94<--------***************************
Example=95
=========
NOTE:-
-----
PROGRAME=95
=========
EXPLANATION:-
============
***************************-----END of--->95<--------***************************
Example=96
=========
NOTE:-
-----
PROGRAME=96
=========
EXPLANATION:-
============
***************************-----END of--->96<--------***************************
Example=97
=========
NOTE:-
-----
PROGRAME=97
=========
EXPLANATION:-
============
***************************-----END of--->97<--------***************************
Example=98
=========
NOTE:-
-----
PROGRAME=98
=========
EXPLANATION:-
============
***************************-----END of--->98<--------***************************
Example=99
=========
NOTE:-
-----
PROGRAME=99
=========
EXPLANATION:-
============
***************************-----END of--->99<--------***************************
Example=100
=========
NOTE:-
-----
PROGRAME=100
=========
EXPLANATION:-
============
***************************-----END of--->100<--------***************************
