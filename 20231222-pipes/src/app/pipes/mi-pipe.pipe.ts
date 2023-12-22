import { compileNgModule } from '@angular/compiler';
import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'primos'
})
export class MiPipePipe implements PipeTransform {
  
  transform(value: number[]): number[] {
    let primos: number[] = [];
    value.forEach(element => {
      if(this.isPrime(element)){
        primos.push(element);
      }
    });
    return primos;
  }

  isPrime(number:number){
    let primo = true;
    if(number <= -2 || number >= 2){
      for(let i = 2; i< number; i++){
        if(number%i == 0 ){
          primo = false;
            break;
        }
      }
    } 
    return primo;
  }
}