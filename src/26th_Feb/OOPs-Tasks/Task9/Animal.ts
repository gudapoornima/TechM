class Animal {
    name: string;
    species: string;

    constructor(name: string, species: string) {
        this.name = name;
        this.species = species;
    }
}

class Tiger extends Animal {
    constructor(name: string) {
        super(name, "Tiger"); 
    }

    roar(): void {
        console.log(this.name, "the Tiger is roaring! ");
    }
}

let myTiger = new Tiger("Sheru");
myTiger.roar();
