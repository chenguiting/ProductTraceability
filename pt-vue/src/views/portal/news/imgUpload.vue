<template>
  <el-upload
    class="img-upload"
    ref="upload"
    action="http://localhost:8080/portal/fileUpload"
    :headers="myHeaders"
    :on-preview="handlePreview"
    :on-remove="handleRemove"
    :before-remove="beforeRemove"
    :on-success="handleSuccess"
    multiple
    :limit="1"
    :on-exceed="handleExceed"
    :file-list="fileList">
    <el-button size="mini" icon="el-icon-upload"  type="primary">点击上传</el-button>
    <div slot="tip" class="el-upload__tip">只能上传jpg/png文件且不超过500kb</div>
  </el-upload>

</template>
<script>
//设置头部，token
  var Token = "Bearer"+store.getters.access_token
  import store from "@/store" ;


  export default {
    name: 'ImgUpload',
    data () {
      return {
        fileList: [],
        url: '',
        myHeaders:{
          Authorization:Token
        }
      }

    },

    methods: {


      handleRemove (file, fileList) {
      },
      handlePreview (file) {
      },
      handleExceed (files, fileList) {
        this.$message.warning(`当前限制选择 1 个文件，本次选择了 ${files.length} 个文件，共选择了 ${files.length + fileList.length} 个文件`)
      },
      beforeRemove (file, fileList) {
        return this.$confirm(`确定移除 ${file.name}？`)
      },
      handleSuccess (response) {
        this.url = response;
        this.$emit('onUpload');
        this.$message.warning('上传成功')
      },
      clear () {
        this.$refs.upload.clearFiles()
      }
    }
  }
</script>
