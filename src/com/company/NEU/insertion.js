let insertion = (toBeSorted) => {
    let length = toBeSorted.length;
    for (let i = 1; i < length; i++) {
        let key = toBeSorted[i];
        let j = i - 1;
        while (j >= 0 && toBeSorted[j] > key) {
            toBeSorted[j + 1] = toBeSorted[j];
            j--;
        }
        toBeSorted[j + 1] = key;
    }
    return toBeSorted;
};