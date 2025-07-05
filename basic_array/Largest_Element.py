class Solution:
    def largestElement(self, nums):
        if not nums:
            return None
        largest=nums[0]
        for i in nums[1:]:
            if i > largest:
                largest=i

        return largest