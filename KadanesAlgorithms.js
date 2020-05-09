function kadanesAlgorithm(array) {
  // Write your code here.
	let tempMax = array[0];
	let previous = array[0];
	for(let i = 1 ; i < array.length; i++){
	   previous = array[i] > array[i]+ previous ? array[i] : array[i] +previous;
		tempMax = tempMax < previous ? previous : tempMax;
	}
	return tempMax;
}

// Do not edit the line below.
exports.kadanesAlgorithm = kadanesAlgorithm;
