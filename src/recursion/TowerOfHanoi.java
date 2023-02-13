package recursion;

public class TowerOfHanoi {
	void TowersOfHanoi(int n, char frompeg,char topeg, char auxpeg) {
		if(n==1) {
			System.out.println("Move disk 1 from peg"+frompeg+" to peg" +topeg);
		}
		TowersOfHanoi(n-1,frompeg,auxpeg,topeg);
		System.out.println("Move disk from peg"+frompeg+" to peg"+topeg);
		TowersOfHanoi(n-1,auxpeg,topeg,frompeg);
		//addasd
	}
}
