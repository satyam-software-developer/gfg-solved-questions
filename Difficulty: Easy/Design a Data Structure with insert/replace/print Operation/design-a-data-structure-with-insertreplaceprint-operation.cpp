list<int> l;

// inserts an integer at the end of the data structure.
void insert(int x) {
	l.push_back(x);
}

// prints the elements of the data structure
void print() {
	for (int x : l)
		cout << x << " ";
	cout << endl;
}

// replaces the first occurrence of x with sequence.
void replace(int x, vector<int> sequence) {
	
	for (auto it = l.begin(); it != l.end(); it++) {
		
		if (*it == x) {
			
			it = l.erase(it);
			
			l.insert(it, sequence.begin(), sequence.end());
			
			break;
		}
	}
}
