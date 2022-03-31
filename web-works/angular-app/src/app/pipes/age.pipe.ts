import { Pipe, PipeTransform } from '@angular/core';

/*
  // only age 
  {{contact.dob | age }}
  {{contact.dob | age:1 }}
    --> 44 Years 

    {{contact.dob | age : 1}}
    ---> 44 Years 3 Months 

    {{contact.dob | age : 2}}
    ---> 44 Years 3 Months 2 Days 
*/

@Pipe({
  name: 'age'
})
export class AgePipe implements PipeTransform {

  transform(dob: string, flag?: number): any {

    if (!dob) {
      return '';
    }

    // ensure your data in dob is in ISO format (yyyy-mm-dd)
    const date1 = new Date(dob);
    const diff = Date.now() - date1.getTime();
    const date2 = new Date(diff);
    const year = date2.getFullYear()-1970;
    const month = date2.getMonth();
    const days = date2.getDay();

    let output = '';

    switch (flag) {
      case 1:
        output = `${year} Years`;
        break;
      case 2:
        output = `${year}  Years ${month} Months`;
        break;
      case 3:
        output = `${year}  Years ${month} Months ${days} Days`;
        break;
        break;
      default:
        output = `${year} Years`;
        break;
    }

    return output; 

  }

}
