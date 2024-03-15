//Return the number of vowels in a string


function vowelcount(inputstring) {
    let numberofvowel = ''
    const vowels = 'aeiou'
    for (let start=0; start < inputstring.length; start=start+1)
    {if (vowels.includes(inputstring[start])) {
       numberofvowel++    }      
}
console.log (numberofvowel)
    }
    const string = "adebola is learning javascript"
vowelcount(string)

