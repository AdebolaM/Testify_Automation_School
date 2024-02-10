const books = {Title: "JAVASCRIPT 101",

    Description: "This book will teach everythingyou need to know about Javascript",
    
    NumberOfPages: 16,
    
    Authour: "Ajoke Oritu",
    
    Reading: false,

    togglereadingornotreading: function(){
        if (books.Reading === false){
            books.Reading = true
        }else {
            books.Reading = false 
        }
    }
}
books.togglereadingornotreading()
console.log(books.Reading)