const originalArray = [1, 2, 3, 4, 5];
 
const newArray = originalArray.map(number => number + 1);
 
//console.log(originalArray); // [1, 2, 3, 4, 5]
//console.log(newArray); // [2, 3, 4, 5, 6]

const myArray = [1, 2, 3];
 
// using the third argument to map
myArray.map((value, index, array) => {
  return array[index] + 1;
});
 
// using the variable that holds the original array
myArray.map((value, index) => {
  return myArray[index] + 1;
});
 
// just using map without accessing the array manually
myArray.map((value) => {
  return value + 1;
});

const red = [0, 1, 2, 3, 4].reduce((accumulator, currentValue, currentIndex, array => {
    return accumulator + currentValue;
}, 10)

[{name:'Martin', age:33}, {name: 'kurt', age:99}, {name:"joe", age:60}].reduce((acc, cur) => acc > cur.age ? acc : cur.age,0))
