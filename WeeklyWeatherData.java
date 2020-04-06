
public class WeeklyWeatherData {

	static int NUMDAYS =7;
	
	double[] rainfall = new double[NUMDAYS];
	double[] avgPressure = new double[NUMDAYS];
	double avgRain;
	double maxRain;
	
	public void setDataDoule(double[] rain,double[] pressure) {
		rainfall = rain;
		avgPressure = pressure;
	}
	
	public void calculateStats() {
		maxRain=0.0;
		double rainSum=0.0;
		
		for(int i=1;i<rainfall.length-1;i++) {
			if(rainfall[i]>=maxRain)
				maxRain = rainfall[i];
			rainSum+=rainfall[i];  
		}
		avgRain =rainSum/NUMDAYS;
	}
	double getAvgRain() {
		return avgRain;
	}
	double getMaxRain() {
		return maxRain;
		
	}
}
