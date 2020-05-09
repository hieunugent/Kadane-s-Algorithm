#include <vector>
using namespace std;
int kadanesAlgorithm(vector<int> array) {
  // Write your code here.
	int tempMax = array[0];
	int previous = array[0];
	for(int i = 1; i < array.size(); i++){
		previous = max(array[i], array[i]+ previous);
		tempMax = max(previous, tempMax);
	}
  return tempMax;
}
