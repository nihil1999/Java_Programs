/**
 * 
 */
package collections;

/**
 * @author logan
 *
 */
public class Mobile {
	
	private String brand;
	private String mobileName;
	private String modelNo;
	private String processor;
	private int camera;
	private int battery;
	private int storage;
	private int ram;
	private long price;
	
	public Mobile(String brand,String mobileName, String modelNo, String processor, int camera, int battery, int storage, int ram,long price) 
	{
		this.brand=brand;
		this.mobileName = mobileName;
		this.modelNo = modelNo;
		this.processor = processor;
		this.camera = camera;
		this.battery = battery;
		this.storage = storage;
		this.ram = ram;
		this.price = price;
	}

	/**
	 * @return the mobileName
	 */
	public String getBrand() {
		return brand;
	}
	
	public String getMobileName() {
		return mobileName;
	}

	/**
	 * @param mobileName the mobileName to set
	 */
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	/**
	 * @return the modelNo
	 */
	public String getModelNo() {
		return modelNo;
	}

	/**
	 * @param modelNo the modelNo to set
	 */
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	/**
	 * @return the processor
	 */
	public String getProcessor() {
		return processor;
	}

	/**
	 * @param processor the processor to set
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	/**
	 * @return the camera
	 */
	public int getCamera() {
		return camera;
	}

	/**
	 * @param camera the camera to set
	 */
	public void setCamera(int camera) {
		this.camera = camera;
	}

	/**
	 * @return the battery
	 */
	public int getBattery() {
		return battery;
	}

	/**
	 * @param battery the battery to set
	 */
	public void setBattery(int battery) {
		this.battery = battery;
	}

	/**
	 * @return the storage
	 */
	public int getStorage() {
		return storage;
	}

	/**
	 * @param storage the storage to set
	 */
	public void setStorage(int storage) {
		this.storage = storage;
	}

	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}

	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}

	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return "\n(Brand Name : "+this.getBrand()+", Mobile Name : "+this.getMobileName() +", Model No : "+this.getModelNo()+", Processor : "+this.getProcessor()+
		", Camera : "+this.getCamera()+" MP "+", Battery : "+this.getBattery()+" mAH"+", Storage : "+this.getStorage()+" GB"+", Ram : "+this.getRam()+" GB, Price : Rs "+this.getPrice()+ ")\n";
	}

}
