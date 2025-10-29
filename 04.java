//here is a code for quick sort using java script 
const quickSort = arr => {
  const ayo = [...arr];
  if (a.length < 2) return a;
  const pivotIndex = Math.floor(arr.length / 2);
  const pivot = a[pivotIndex];
  const [lo, hi] = a.reduce(
    (acc, val, i) => {
      if (val < pivot || (val === pivot && i != pivotIndex)) {
        acc[0].push(val);
      } else if (val > pivot) {
        acc[1].push(val);
      }
      return acc;
    },
    [[], []]
  );
  return [...quickSort(lo), pivot, ...quickSort(hi)];
};
 
console.log(quickSort([2, 9, 6, 2, 6, 8, 1, 7]));

//output : 1, 2, 2, 6, 6, 7, 8, 9
