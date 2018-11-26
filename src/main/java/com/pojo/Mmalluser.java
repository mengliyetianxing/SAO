package com.pojo;
import java.util.Date;import java.util.List;


public class Mmalluser{
	private int userid;
	private String username;
	private String userpassword;
	private String useremail;
	private String userphone;
	private String userquestion;
	private String useranswer;
	private String userrole;
	private Date usercreatetime;
	private Date userupdatetime;	private Mmallcart mmac;	private List<Mmallorder> mmar;	private List<Mmallshipping> mmasp;		public Mmallcart getMmac() {		return mmac;	}	public void setMmac(Mmallcart mmac) {		this.mmac = mmac;	}	public List<Mmallorder> getMmar() {		return mmar;	}	public void setMmar(List<Mmallorder> mmar) {		this.mmar = mmar;	}	public List<Mmallshipping> getMmasp() {		return mmasp;	}	public void setMmasp(List<Mmallshipping> mmasp) {		this.mmasp = mmasp;	}
	public void setUserid(int userid){
		this.userid=userid;
	}
	public int getUserid(){
		return userid;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
		return username;
	}
	public void setUserpassword(String userpassword){
		this.userpassword=userpassword;
	}
	public String getUserpassword(){
		return userpassword;
	}
	public void setUseremail(String useremail){
		this.useremail=useremail;
	}
	public String getUseremail(){
		return useremail;
	}
	public void setUserphone(String userphone){
		this.userphone=userphone;
	}
	public String getUserphone(){
		return userphone;
	}
	public void setUserquestion(String userquestion){
		this.userquestion=userquestion;
	}
	public String getUserquestion(){
		return userquestion;
	}
	public void setUseranswer(String useranswer){
		this.useranswer=useranswer;
	}
	public String getUseranswer(){
		return useranswer;
	}
	public void setUserrole(String userrole){
		this.userrole=userrole;
	}
	public String getUserrole(){
		return userrole;
	}
	public void setUsercreatetime(Date usercreatetime){
		this.usercreatetime=usercreatetime;
	}
	public Date getUsercreatetime(){
		return usercreatetime;
	}
	public void setUserupdatetime(Date userupdatetime){
		this.userupdatetime=userupdatetime;
	}
	public Date getUserupdatetime(){
		return userupdatetime;
	}	public Mmalluser(int userid, String username, String userpassword, String useremail, String userphone,			String userquestion, String useranswer, String userrole, Date usercreatetime, Date userupdatetime,			Mmallcart mmac, List<Mmallorder> mmar, List<Mmallshipping> mmasp) {		super();		this.userid = userid;		this.username = username;		this.userpassword = userpassword;		this.useremail = useremail;		this.userphone = userphone;		this.userquestion = userquestion;		this.useranswer = useranswer;		this.userrole = userrole;		this.usercreatetime = usercreatetime;		this.userupdatetime = userupdatetime;		this.mmac = mmac;		this.mmar = mmar;		this.mmasp = mmasp;	}	public Mmalluser() {	}	@Override	public String toString() {		return "Mmalluser [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword				+ ", useremail=" + useremail + ", userphone=" + userphone + ", userquestion=" + userquestion				+ ", useranswer=" + useranswer + ", userrole=" + userrole + ", usercreatetime=" + usercreatetime				+ ", userupdatetime=" + userupdatetime + ", mmac=" + mmac + ", mmar=" + mmar + ", mmasp=" + mmasp + "]";	}	
}