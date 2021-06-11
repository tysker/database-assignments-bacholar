// 1. Map the list of numbers to a list of their square roots:
const sqrt = [1, 9, 16, 100].map(num => Math.sqrt(num));
console.log(sqrt);
// [1, 9, 16, 100]

// 2. Map the list of words so each is wrapped in a h1 tag:  
const words = ["Intro", "Requirements", "Analysis", "Implementation", "Conclusion", "Discussion","References"].map( word => `<h1>${word}</h1>`);
console.log(words);
/*
[ '<h1>Intro</h1>',
  '<h1>Requirements</h1>',
  '<h1>Analysis</h1>',
  '<h1>Implementation</h1>',
  '<h1>Conclusion</h1>',
  '<h1>Discussion</h1>',
  '<h1>References</h1>' ]
*/

// 3. Use map to uppercase the words (all letters):  
const upper = ["i’m", "yelling", "today"].map( word => word.toUpperCase());
console.log(upper);
// [ 'I’M', 'YELLING', 'TODAY' ]

// 4. Use map to transform words into their lengths: 
const len = ["I", "have", "looooooong","words"].map( word => word.length);
console.log(len);
// [ 1, 4, 10, 5 ]

/* 5. Get the json file comics.json from the course site.   
Paste it into your browser’s Javascript console. 
Use map to get all the image urls, and wrap them in img-tags.
*/

const fs = require('fs');
let data = fs.readFileSync('comics.json');
let comics = JSON.parse(data);
//console.log(comics);

const img = comics.map( ( value => `<img src="${value.img}">`));
console.log(img);
/*
[ '<img src="https://imgs.xkcd.com/comics/red_spiders_2.jpg">',
  '<img src="https://imgs.xkcd.com/comics/love.jpg">',
  '<img src="https://imgs.xkcd.com/comics/schrodinger.jpg">',
  '<img src="https://imgs.xkcd.com/comics/secrets.jpg">',
  '<img src="https://imgs.xkcd.com/comics/counter-red-spiders.jpg">',
  '<img src="https://imgs.xkcd.com/comics/found.jpg">',
  '<img src="https://imgs.xkcd.com/comics/want.jpg">',
  '<img src="https://imgs.xkcd.com/comics/penny_arcade.jpg">' ]
*/

// 6. Use reduce to sum the array of numbers:  
const reduce_numbers = [1,2,3,4,5].reduce( (result, num) => result + num);
console.log(reduce_numbers);
// 15

// 7. Use reduce to sum the x-value of the objects in the array: 
const x_values = [{x:1},{x:2},{x:3}].reduce( (acc, element) => acc + element.x);
//console.log(x_values);
// 6

// 8.  Use reduce to flatten an array of arrays:

const flatten = [[1,2],[3,4],[5,6]].reduce(function(value, index) {
    return value.concat(index)
});
console.log(flatten);

// 9. Use reduce to return an array of the positive numbers: 
const positive = [-3, -1, 2, 4, 5].reduce((acc, element) => {
if(element > 0) {
    acc.push(element)
}
return acc;
},[]);

console.log(positive);

// 10. The accumulator function can obviously use objects outside of itself. Use reduce to implement groupBy.

people = [
    {name : "Rikke" , age : 46} ,
    {name : "Michael" , age : 47} ,
    {name : "Mathias" , age : 46}
];

const groupBy = (input, key) => {
    return input.reduce((acc, currentValue) => {
        let groupKey = currentValue[key];
        if (!acc[groupKey]) {
          acc[groupKey] = [];
        }
        acc[groupKey].push(currentValue);
        return acc;

    },{});// empty object is the initial value for result object
};

const group = groupBy(people, "age");
console.log(group);