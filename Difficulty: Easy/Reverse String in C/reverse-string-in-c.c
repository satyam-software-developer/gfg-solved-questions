void reverseString(char str[]) {
	// code here
	int i = 0;
	int j = strlen(str) - 1;
	
	while (i < j) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		i++;
		j--;
		
	}
	printf("%s", str);
};
