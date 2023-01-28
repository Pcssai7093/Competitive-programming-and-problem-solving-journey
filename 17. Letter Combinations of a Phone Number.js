/**
 * @param {string} digits
 * @return {string[]}
 */
let strlist=[];
function fun(map,str,digits,index,dlen,limit){
    if(index>=(limit)){
        strlist.push(str);
        return;
    }
    if(index<limit){a

    let ind=parseInt(digits[index]);
    let tary=map[ind];
    // console.log(tary);
    let tlen=tary?.length;
    // console.log(tlen)
    console.log(str)
    for(let i=0;i<tlen;i++){
        let tstring=str.slice();
        tstring=tstring.concat(tary[i]);
        fun(map,tstring,digits,index+1,tlen,limit);
    }

    }

}
var letterCombinations = function(digits) {
    strlist=[];
    let map={
        2:['a','b','c'],
        3:['d','e','f'],
        4:['g','h','i'],
        5:['j','k','l'],
        6:['m','n','o'],
        7:['p','q','r','s'],
        8:['t','u','v'],
        9:['w','x','y','z']
    }

    let len=digits.length;
    if(len==0)
    return strlist;
    let ind=parseInt(digits[0]);
    let dary=map[ind];
    let dlen=map[ind].length;
    for(let i=0;i<dlen;i++){
        let tstring="";
        tstring=tstring.concat(dary[i]);
        console.log(dlen);
        fun(map,tstring,digits,1,dlen,digits.length);
    }
    // console.log(map[parseInt(digits[0])].length)
    return strlist;
};
