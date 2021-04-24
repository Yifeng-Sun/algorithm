let bubble = (toBeSorted) => {
    let length = toBeSorted.length;
    for (let i = 0; i < length; i++) {
        for (let j = 0; j < length; j++) {
            if (toBeSorted[j] > toBeSorted[j + 1]) {
                const tmp = toBeSorted[j];
                toBeSorted[j] = toBeSorted[j + 1];
                toBeSorted[j + 1] = tmp;
            }
        }
    }
    return toBeSorted;
};