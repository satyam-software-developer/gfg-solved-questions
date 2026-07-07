/* You are required to complete below methods */

/*inserts an element x to the unordered set s */
void insert(unordered_set<int> &s, int x) {
	// Your code here
	s.insert(x);
}

/*erases an element x from the unordered set s */
void erase(unordered_set<int> &s, int x) {
	
	// Your code here
	s.erase(x);
}

/*return s the size of the unordered set s */

int size(unordered_set<int> &s) {
	// Your code here
	return s.size();
}

/*return s 1 if the element x is present

in unordered set s else return s - 1 */
int find(unordered_set<int> &s, int x) {
	// Your code here
	if (s.find(x) != s.end()) {
		return 1 ;
	}
	return - 1;
}
