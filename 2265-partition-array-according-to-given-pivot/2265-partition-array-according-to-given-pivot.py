class Solution:
    def pivotArray(self, arr: List[int], x: int) -> List[int]:
        small=[]
        gre=[]
        same=[]
        for i in range(len(arr)):
            if arr[i]<x:
                small.append(arr[i])
            elif arr[i]==x:
                same.append(arr[i])
            else:
                gre.append(arr[i])
        return small+same+gre