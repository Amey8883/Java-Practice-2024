class MyInfo
{
	private String name,nativePlace,branch;

	MyInfo(String name,String nativePlace,String branch)
	{
		this.name = name;
		this.nativePlace = nativePlace;
		this.branch = branch;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String updateName)
	{
		name = updateName;
	}

	public String getnativePlace()
	{
		return nativePlace;
	}
	public void setnativePlace(String updatenativePlace)
	{
		nativePlace = updatenativePlace;
	}

	public String getbranch()
	{
		return branch;
	} 
	public void setbranch(String updatebranch)
	{
		branch = updatebranch;
	} 
}
class EncapsulationExample{
	public static void main(String[] args) {
		MyInfo obj = new MyInfo("Amey","Pune","MCA");
		System.out.println(obj.getName());
		System.out.println(obj.getnativePlace());
		System.out.println(obj.getbranch());
	}
}