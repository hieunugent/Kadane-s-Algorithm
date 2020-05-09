def kadanesAlgorithm(array):
    # Write your code here.
	temMax = array[0];
	previous = array[0];
	for i in range(1, len(array)):
		previous = max(array[i], array[i]+ previous)
		temMax = max(previous, temMax)
	return temMax
