import {Pipe, PipeTransform} from '@angular/core';

@Pipe({
    name: 'filterData'
})

export class FilterData implements PipeTransform {
    transform(items:any[], args:string):any[] {
        if (typeof items === 'object') {
            var resultArray = [];
            if (args.length === 0) {
                resultArray = items;
                console.log('in if');
            }
            else {
                for (let item of items) {
                    if (item != null && !(item.match(new RegExp(' ' +args, 'i')))) {
                        resultArray.push(item);
                        console.log(item);
                    }
                }     
            }                    
            console.log('returning from outer if');
            return resultArray;
        }
        else {
            console.log('returning null');
            return null;
        }
    }
}