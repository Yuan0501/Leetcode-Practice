public class Problem605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n){
        if(flowerbed.length == 1 && flowerbed[0] == 1){
            return false;
        }

        int validBed = 0;

        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            validBed = 1;
            flowerbed[0] = 1;
        }

        for(int i = 1; i < flowerbed.length - 1; i++){

            if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                validBed += 1;
            }
        }
        int len = flowerbed.length;
        if(flowerbed[len-1] == 0 && flowerbed[len - 2] == 0){
            validBed += 1;
        }

        return validBed >= n;
    }
}
