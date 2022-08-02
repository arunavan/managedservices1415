package adapter;

//adapter
public class ElectricSocketClassAdapterImpl extends ElectricSocket implements ElectricSocketAdapter{
	//ElectricSocket es=new ElectricSocket();
	@Override
	public ElectricVolt get120Volt() {
		return getVolt();
	}
	@Override
	public ElectricVolt get12Volt() {
		ElectricVolt v= getVolt();
		return convertVolt(v,10);
	}
	@Override
	public ElectricVolt get3Volt() {
		ElectricVolt v= getVolt();
		return convertVolt(v,40);
	}
	private ElectricVolt convertVolt(ElectricVolt v, int i) {
		return new ElectricVolt(v.getVolts()/i);
	}
}
