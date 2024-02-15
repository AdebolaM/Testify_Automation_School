//Create a function that filters out negative numbers
//const Mylist = [-2, -3, -1, 0, 2, 5, 6, 7];

//function FilterFunction(list) {
//    for (let start=0; start= list.length; start=start+1) {
//        if (list[start] >= 0) {
 //           console.log(list[start]);
 //       }
 //   }

//}
const Mylist = [-2, -3, -1, 0, 2, 5, 6, 7];

function FilterFunction(list) {
    let ResultList = [];
    for (let start = 0; start < list.length; start = start+1) {
        if (list[start] >= 0) {
            ResultList.push(list[start]);
        }
    }
    return ResultList;
}

console.log(FilterFunction(Mylist));

//const ResultArray = []

//ResultArray.push (FilterFunction(Mylist))
//console.log(ResultArray)

