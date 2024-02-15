//Print a table containing multiplication tables
function printMultiplicationTable() {
    for (let a= 1; a<= 10; a=a+1) {
        let row = '';
        for (let b = 1; b <= 10; b=b+1) {
            row += `${a * b}\t`;
        }
        console.log(row);
    }
}

printMultiplicationTable();
