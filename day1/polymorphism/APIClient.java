package week3.day1.polymorphism;

public class APIClient {
	
	public void sendRequest(String send) {
		System.out.println("SendRequest "+send);
		
	}
	public void sendRequest(String endpoint, String requestBody, Boolean requestStatus) {
		System.out.println("Endpoint "+ endpoint);
		System.out.println("RequestBody "+ requestBody);
		System.out.println("RequestStatus "+ requestStatus);
		
	}
	public static void main(String[] args) {
		APIClient value = new APIClient();
		value.sendRequest("New Override value");
		value.sendRequest("overload", "overloading", true);
		
	}
}
