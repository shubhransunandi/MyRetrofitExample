package Model.JtvJsonModel;

public class ArchiveTemp{
	private String reasonName;
	private int itemId;
	private String itemName;
	private long archivedOn;
	private int reasonId;
	private Object imageUrl;
	private int userId;

	public void setReasonName(String reasonName){
		this.reasonName = reasonName;
	}

	public String getReasonName(){
		return reasonName;
	}

	public void setItemId(int itemId){
		this.itemId = itemId;
	}

	public int getItemId(){
		return itemId;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getItemName(){
		return itemName;
	}

	public void setArchivedOn(long archivedOn){
		this.archivedOn = archivedOn;
	}

	public long getArchivedOn(){
		return archivedOn;
	}

	public void setReasonId(int reasonId){
		this.reasonId = reasonId;
	}

	public int getReasonId(){
		return reasonId;
	}

	public void setImageUrl(Object imageUrl){
		this.imageUrl = imageUrl;
	}

	public Object getImageUrl(){
		return imageUrl;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	@Override
 	public String toString(){
		return
			"ArchiveTemp{" +
			"reasonName = '" + reasonName + '\'' +
			",itemId = '" + itemId + '\'' +
			",itemName = '" + itemName + '\'' +
			",archivedOn = '" + archivedOn + '\'' +
			",reasonId = '" + reasonId + '\'' +
			",imageUrl = '" + imageUrl + '\'' +
			",userId = '" + userId + '\'' +
			"}";
		}
}
