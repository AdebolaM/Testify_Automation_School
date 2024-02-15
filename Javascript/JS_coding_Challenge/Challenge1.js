//Calculate the sum of numbers within an array
const MyArray = [1, 2, 3, 4, 5, 6, 7, 8, 9];

function SumOfNumber(InputArray) {
    let sumFunction = 0
    for (let start = 0; start < InputArray.length; start = start + 1) {
        sumFunction += InputArray[start]
    }
    return sumFunction
}

console.log(SumOfNumber(MyArray))

