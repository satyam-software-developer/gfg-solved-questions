void printUsingAddress() {
	int a;
	cin>> a;
	int *addr;
	
	// code here
	addr = &a;
	
	cout << *addr ;
}
