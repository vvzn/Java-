package experiment;
import experiment.*;
public class Test {
	public static void main(String args[]) {
		CPU cpu=new CPU();
		HardDisk disk=new HardDisk();
		PC pc=new PC();
		cpu.setSpeed(2200);
		disk.setAmount(200);
		cpu.setPrice(4000);
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}

}
