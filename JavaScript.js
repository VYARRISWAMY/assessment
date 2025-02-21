//******************** A ********************* */ 

function reverseWords(sentence) {
    // Split the sentence into an array of words
    let words = [];
    let start = 0;
    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] === ' ' || i === sentence.length - 1) {
            if (i === sentence.length - 1) i++; // Include the last character
            words.push(sentence.substring(start, i));
            start = i + 1;
        }
    }

    // Reverse each word individually
    for (let i = 0; i < words.length; i++) {
        let word = words[i];
        let reversedWord = '';
        for (let j = word.length - 1; j >= 0; j--) {
            reversedWord += word[j];
        }
        words[i] = reversedWord;
    }

    // Join the reversed words into a sentence
    let reversedSentence = '';
    for (let i = 0; i < words.length; i++) {
        reversedSentence += words[i];
        if (i < words.length - 1) {
            reversedSentence += ' ';
        }
    }

    return reversedSentence;
}

// Example usage:
let sentence = "Hello World";
console.log(reverseWords(sentence)); // Output: "olleH dlroW"

// ******************* B ********************* //

function sortDescending(arr) {
    for (let i = 0; i < arr.length - 1; i++) {
        for (let j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] < arr[j + 1]) {
                // Swap the elements
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    return arr;
}

// Example usage:
let numbers = [5, 2, 9, 1, 5, 6];
console.log(sortDescending(numbers)); // Output: [9, 6, 5, 5, 2, 1]
