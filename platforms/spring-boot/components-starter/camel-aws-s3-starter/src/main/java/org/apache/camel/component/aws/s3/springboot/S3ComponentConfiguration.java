/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.aws.s3.springboot;

import javax.annotation.Generated;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.EncryptionMaterials;
import org.apache.camel.component.aws.s3.S3Operations;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The aws-s3 component is used for storing and retrieving objecct from Amazon
 * S3 Storage Service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws-s3")
public class S3ComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws-s3 component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The AWS S3 default configuration
     */
    private S3ConfigurationNestedConfiguration configuration;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;
    /**
     * The region where the bucket is located. This option is used in the
     * com.amazonaws.services.s3.model.CreateBucketRequest.
     */
    private String region;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;

    public S3ConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            S3ConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public static class S3ConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.aws.s3.S3Configuration.class;
        /**
         * Setup the partSize which is used in multi part upload, the default
         * size is 25M.
         */
        private Long partSize = 26214400L;
        /**
         * If it is true, camel will upload the file with multi part format, the
         * part size is decided by the option of `partSize`
         */
        private Boolean multiPartUpload = false;
        /**
         * Amazon AWS Access Key
         */
        private String accessKey;
        /**
         * Amazon AWS Secret Key
         */
        private String secretKey;
        /**
         * Reference to a `com.amazonaws.services.s3.AmazonS3` in the registry.
         */
        private AmazonS3 amazonS3Client;
        /**
         * The prefix which is used in the
         * com.amazonaws.services.s3.model.ListObjectsRequest to only consume
         * objects we are interested in.
         */
        private String prefix;
        /**
         * The delimiter which is used in the
         * com.amazonaws.services.s3.model.ListObjectsRequest to only consume
         * objects we are interested in.
         */
        private String delimiter;
        /**
         * Name of the bucket. The bucket will be created if it doesn't already
         * exists.
         */
        private String bucketName;
        /**
         * To get the object from the bucket with the given file name
         */
        private String fileName;
        /**
         * The region in which S3 client needs to work
         */
        private String region;
        /**
         * If it is true, the exchange body will be set to a stream to the
         * contents of the file. If false, the headers will be set with the S3
         * object metadata, but the body will be null. This option is strongly
         * related to autocloseBody option. In case of setting includeBody to
         * true and autocloseBody to false, it will be up to the caller to close
         * the S3Object stream. Setting autocloseBody to true, will close the
         * S3Object stream automatically.
         */
        private Boolean includeBody = true;
        /**
         * Delete objects from S3 after they have been retrieved. The delete is
         * only performed if the Exchange is committed. If a rollback occurs,
         * the object is not deleted. <p/> If this option is false, then the
         * same objects will be retrieve over and over again on the polls.
         * Therefore you need to use the Idempotent Consumer EIP in the route to
         * filter out duplicates. You can filter using the {@link
         * S3Constants#BUCKET_NAME} and {@link S3Constants#KEY} headers, or only
         * the {@link S3Constants#KEY} header.
         */
        private Boolean deleteAfterRead = true;
        /**
         * Delete file object after the S3 file has been uploaded
         */
        private Boolean deleteAfterWrite = false;
        /**
         * The policy for this queue to set in the
         * `com.amazonaws.services.s3.AmazonS3#setBucketPolicy()` method.
         */
        private String policy;
        /**
         * The storage class to set in the
         * `com.amazonaws.services.s3.model.PutObjectRequest` request.
         */
        private String storageClass;
        /**
         * Sets the server-side encryption algorithm when encrypting the object
         * using AWS-managed keys. For example use <tt>AES256</tt>.
         */
        private String serverSideEncryption;
        /**
         * To define a proxy host when instantiating the SQS client
         */
        private String proxyHost;
        /**
         * Specify a proxy port to be used inside the client definition.
         */
        private Integer proxyPort;
        /**
         * Whether or not the S3 client should use path style access
         */
        private Boolean pathStyleAccess = false;
        /**
         * The operation to do in case the user don't want to do only an upload
         */
        private S3Operations operation;
        /**
         * If this option is true and includeBody is true, then the
         * S3Object.close() method will be called on exchange completion. This
         * option is strongly related to includeBody option. In case of setting
         * includeBody to true and autocloseBody to false, it will be up to the
         * caller to close the S3Object stream. Setting autocloseBody to true,
         * will close the S3Object stream automatically.
         */
        private Boolean autocloseBody = true;
        /**
         * The encryption materials to use in case of Symmetric/Asymmetric
         * client usage
         */
        private EncryptionMaterials encryptionMaterials;
        /**
         * Define if encryption must be used or not
         */
        private Boolean useEncryption = false;
        /**
         * Define if KMS must be used or not
         */
        private Boolean useAwsKMS = false;
        /**
         * Define the id of KMS key to use in case KMS is enabled
         */
        private String awsKMSKeyId;
        /**
         * Define if disabled Chunked Encoding is true or false
         */
        private Boolean chunkedEncodingDisabled = false;
        /**
         * Define if Accelerate Mode enabled is true or false
         */
        private Boolean accelerateModeEnabled = false;
        /**
         * Define if Dualstack enabled is true or false
         */
        private Boolean dualstackEnabled = false;
        /**
         * Define if Payload Signing enabled is true or false
         */
        private Boolean payloadSigningEnabled = false;
        /**
         * Define if Force Global Bucket Access enabled is true or false
         */
        private Boolean forceGlobalBucketAccessEnabled = false;
        /**
         * Set whether the S3 client should expect to load credentials on an EC2
         * instance or to expect static credentials to be passed in.
         */
        private Boolean useIAMCredentials = false;
        /**
         * Setting the autocreation of the bucket
         */
        private Boolean autoCreateBucket = true;
        /**
         * Setting the key name for an element in the bucket through endpoint
         * parameter
         */
        private String keyName;

        public Long getPartSize() {
            return partSize;
        }

        public void setPartSize(Long partSize) {
            this.partSize = partSize;
        }

        public Boolean getMultiPartUpload() {
            return multiPartUpload;
        }

        public void setMultiPartUpload(Boolean multiPartUpload) {
            this.multiPartUpload = multiPartUpload;
        }

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public AmazonS3 getAmazonS3Client() {
            return amazonS3Client;
        }

        public void setAmazonS3Client(AmazonS3 amazonS3Client) {
            this.amazonS3Client = amazonS3Client;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getDelimiter() {
            return delimiter;
        }

        public void setDelimiter(String delimiter) {
            this.delimiter = delimiter;
        }

        public String getBucketName() {
            return bucketName;
        }

        public void setBucketName(String bucketName) {
            this.bucketName = bucketName;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public Boolean getIncludeBody() {
            return includeBody;
        }

        public void setIncludeBody(Boolean includeBody) {
            this.includeBody = includeBody;
        }

        public Boolean getDeleteAfterRead() {
            return deleteAfterRead;
        }

        public void setDeleteAfterRead(Boolean deleteAfterRead) {
            this.deleteAfterRead = deleteAfterRead;
        }

        public Boolean getDeleteAfterWrite() {
            return deleteAfterWrite;
        }

        public void setDeleteAfterWrite(Boolean deleteAfterWrite) {
            this.deleteAfterWrite = deleteAfterWrite;
        }

        public String getPolicy() {
            return policy;
        }

        public void setPolicy(String policy) {
            this.policy = policy;
        }

        public String getStorageClass() {
            return storageClass;
        }

        public void setStorageClass(String storageClass) {
            this.storageClass = storageClass;
        }

        public String getServerSideEncryption() {
            return serverSideEncryption;
        }

        public void setServerSideEncryption(String serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public Boolean getPathStyleAccess() {
            return pathStyleAccess;
        }

        public void setPathStyleAccess(Boolean pathStyleAccess) {
            this.pathStyleAccess = pathStyleAccess;
        }

        public S3Operations getOperation() {
            return operation;
        }

        public void setOperation(S3Operations operation) {
            this.operation = operation;
        }

        public Boolean getAutocloseBody() {
            return autocloseBody;
        }

        public void setAutocloseBody(Boolean autocloseBody) {
            this.autocloseBody = autocloseBody;
        }

        public EncryptionMaterials getEncryptionMaterials() {
            return encryptionMaterials;
        }

        public void setEncryptionMaterials(
                EncryptionMaterials encryptionMaterials) {
            this.encryptionMaterials = encryptionMaterials;
        }

        public Boolean getUseEncryption() {
            return useEncryption;
        }

        public void setUseEncryption(Boolean useEncryption) {
            this.useEncryption = useEncryption;
        }

        public Boolean getUseAwsKMS() {
            return useAwsKMS;
        }

        public void setUseAwsKMS(Boolean useAwsKMS) {
            this.useAwsKMS = useAwsKMS;
        }

        public String getAwsKMSKeyId() {
            return awsKMSKeyId;
        }

        public void setAwsKMSKeyId(String awsKMSKeyId) {
            this.awsKMSKeyId = awsKMSKeyId;
        }

        public Boolean getChunkedEncodingDisabled() {
            return chunkedEncodingDisabled;
        }

        public void setChunkedEncodingDisabled(Boolean chunkedEncodingDisabled) {
            this.chunkedEncodingDisabled = chunkedEncodingDisabled;
        }

        public Boolean getAccelerateModeEnabled() {
            return accelerateModeEnabled;
        }

        public void setAccelerateModeEnabled(Boolean accelerateModeEnabled) {
            this.accelerateModeEnabled = accelerateModeEnabled;
        }

        public Boolean getDualstackEnabled() {
            return dualstackEnabled;
        }

        public void setDualstackEnabled(Boolean dualstackEnabled) {
            this.dualstackEnabled = dualstackEnabled;
        }

        public Boolean getPayloadSigningEnabled() {
            return payloadSigningEnabled;
        }

        public void setPayloadSigningEnabled(Boolean payloadSigningEnabled) {
            this.payloadSigningEnabled = payloadSigningEnabled;
        }

        public Boolean getForceGlobalBucketAccessEnabled() {
            return forceGlobalBucketAccessEnabled;
        }

        public void setForceGlobalBucketAccessEnabled(
                Boolean forceGlobalBucketAccessEnabled) {
            this.forceGlobalBucketAccessEnabled = forceGlobalBucketAccessEnabled;
        }

        public Boolean getUseIAMCredentials() {
            return useIAMCredentials;
        }

        public void setUseIAMCredentials(Boolean useIAMCredentials) {
            this.useIAMCredentials = useIAMCredentials;
        }

        public Boolean getAutoCreateBucket() {
            return autoCreateBucket;
        }

        public void setAutoCreateBucket(Boolean autoCreateBucket) {
            this.autoCreateBucket = autoCreateBucket;
        }

        public String getKeyName() {
            return keyName;
        }

        public void setKeyName(String keyName) {
            this.keyName = keyName;
        }
    }
}